package desafio.org.services;

import desafio.org.models.Comentario;
import desafio.org.repositories.ComentarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ComentarioServiceImpl implements ComentarioService{

    @Autowired
    ComentarioRepository ComentarioRepository;
    @Override
    public Comentario crearComentario(Comentario nuevoComentario) {
        return ComentarioRepository.save(nuevoComentario);
    }

    @Override
    public Comentario guardarComentario(Comentario comentario) {
        return ComentarioRepository.save(comentario);
    }

    @Override
    public Comentario obtenerComentarioPorId(Long id) {
        return null;
    }

    @Override
    public List<Comentario> obtenerComentariosPorTarea(Long tareaId) {
        return ComentarioRepository.findAll();
    }

    @Override
    public boolean eliminarComentario(Long id) {
        return false;
    }

    @Override
    public List<Comentario> obtenerListaDeComentarios() {
        return ComentarioRepository.findAll();
    }

    @Override
    public Comentario actualizarComentario(Long id, Comentario comentarioActualizado) {
        return comentarioActualizado;
    }
}



