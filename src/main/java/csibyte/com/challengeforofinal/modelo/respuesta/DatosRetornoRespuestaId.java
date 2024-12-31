package csibyte.com.challengeforofinal.modelo.respuesta;

import csibyte.com.challengeforofinal.modelo.topico.DatosRespuestaTopico;
import csibyte.com.challengeforofinal.modelo.usuario.DatosRespuestaUsuario;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
