package desafio.org.services;

import desafio.org.models.Tarea;

import java.util.List;


public interface TareaService {
    Tarea guardarTarea(Tarea tarea);
    Tarea obtenerTareaPorId(Long id);
    List<Tarea> obtenerTodasLasTareas();
    boolean eliminarTarea(Long id);
    boolean asignarTareaAUsuario(Long tareaId, Long usuarioId);

    Tarea crearTarea(Tarea nuevaTarea);

    Tarea actualizarTarea(Long id, Tarea tareaActualizada);
}
