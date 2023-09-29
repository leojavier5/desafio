package desafio.org.services;


import desafio.org.models.Comentario;

import java.util.List;

public interface ComentarioService {



    Comentario crearComentario(Comentario nuevoComentario);
    Comentario guardarComentario(Comentario comentario);

    Comentario obtenerComentarioPorId(Long id);

    List<Comentario> obtenerComentariosPorTarea(Long tareaId);

    boolean eliminarComentario(Long id);

    List<Comentario> obtenerListaDeComentarios();

    Comentario actualizarComentario(Long id, Comentario comentarioActualizado);
}
