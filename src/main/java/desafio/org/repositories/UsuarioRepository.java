package desafio.org.repositories;

import desafio.org.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

 /*
 List<Usuario> listaDeUsuarios();

 Usuario buscarUsuarioPorId(Long id);

 Usuario guardarUsuario(Usuario usuarioNuevo);
 void borrarUsuario(Long id);

 Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado);
*/

}
