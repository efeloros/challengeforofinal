package csibyte.com.challengeforofinal.intern.security;

import csibyte.com.challengeforofinal.modelo.usuario.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService implements UserDetailsService {

    private UsuarioRepository usuarioRepository;

    //AutenticacionService(UsuarioRepository usuarioRepository) {
    //    this.usuarioRepository = usuarioRepository;
    //}
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(username);
    }
}
