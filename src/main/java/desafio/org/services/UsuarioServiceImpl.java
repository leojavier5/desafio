package desafio.org.services;

import desafio.org.models.Usuario;
import desafio.org.repositories.ComentarioRepository;
import desafio.org.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl  implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    ComentarioRepository ComentarioRepository;

    @Override
    public Usuario crearUsuario(Usuario nuevoUsuario) {
        return null;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {return usuarioRepository.save(usuario);}

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return false;
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado) {
        return usuarioActualizado;
    }
}


