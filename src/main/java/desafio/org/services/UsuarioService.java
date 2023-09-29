package desafio.org.services;

import desafio.org.models.Usuario;

import java.util.List;

public interface UsuarioService {


    Usuario crearUsuario(Usuario nuevoUsuario);
    Usuario guardarUsuario(Usuario usuario);
        Usuario obtenerUsuarioPorId(Long id);
        List<Usuario> obtenerTodosLosUsuarios();
        boolean eliminarUsuario(Long id);

    Usuario actualizarUsuario(Long id, Usuario usuarioActualizado);
}
