package csibyte.com.challengeforofinal.controlador;

import csibyte.com.challengeforofinal.intern.security.DatosJWTtoken;
import csibyte.com.challengeforofinal.intern.security.TokenService;
import csibyte.com.challengeforofinal.modelo.usuario.DatosAutenticacionUsuario;
import csibyte.com.challengeforofinal.modelo.usuario.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;


    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacion) {
        System.out.println(datosAutenticacion);
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacion.email(), datosAutenticacion.contrasena());
        System.out.println("Usuario autenticado"+ authToken);
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        System.out.println(usuarioAutenticado);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        System.out.println(JWTtoken);
        return ResponseEntity.ok(new DatosJWTtoken(JWTtoken));
    }
}
