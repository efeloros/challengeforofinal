package csibyte.com.challengeforofinal.modelo.topico;

import csibyte.com.challengeforofinal.modelo.curso.DatosRespuestaCurso;
import csibyte.com.challengeforofinal.modelo.usuario.DatosRespuestaUsuario;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
