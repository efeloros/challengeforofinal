package csibyte.com.challengeforofinal.modelo.usuario;

import csibyte.com.challengeforofinal.enumerador.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
