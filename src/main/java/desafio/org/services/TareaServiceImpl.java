package desafio.org.services;

import desafio.org.models.Tarea;
import desafio.org.models.Usuario;
import desafio.org.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    @Override
    public boolean eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
        return false;
    }

    @Override
    public boolean asignarTareaAUsuario(Long tareaId, Long usuarioId) {
        Tarea tarea = obtenerTareaPorId(tareaId);
        Usuario usuario = obtenerUsuarioPorId(usuarioId);

        if (tarea != null && usuario != null) {
            tarea.setUsuario(usuario);
            tareaRepository.save(tarea);
        }
        return false;
    }

    @Override
    public Tarea crearTarea(Tarea nuevaTarea) {
        return null;
    }

    @Override
    public Tarea actualizarTarea(Long id, Tarea tareaActualizada) {
        return null;
    }

    private Usuario obtenerUsuarioPorId(Long id) {
        return null;
    }


}
