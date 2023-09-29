package desafio.org.Controllers;

import desafio.org.models.Tarea;
import desafio.org.services.TareaService;
import desafio.org.services.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        Tarea tarea = tareaService.obtenerTareaPorId(id);
        if (tarea != null) {
            return ResponseEntity.ok(tarea);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Tarea> crearTarea(@RequestBody Tarea nuevaTarea) {
        Tarea tareaCreada = tareaService.crearTarea(nuevaTarea);
        return ResponseEntity.status(HttpStatus.CREATED).body(tareaCreada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarea> actualizarTarea(@PathVariable Long id, @RequestBody Tarea tareaActualizada) {
        Tarea tarea = tareaService.actualizarTarea(id, tareaActualizada);
        if (tarea != null) {
            return ResponseEntity.ok(tarea);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        boolean eliminada = tareaService.eliminarTarea(id);
        if (eliminada) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{tareaId}/asignar/{usuarioId}")
    public ResponseEntity<Void> asignarTareaAUsuario(@PathVariable Long tareaId, @PathVariable Long usuarioId) {
        boolean asignada = tareaService.asignarTareaAUsuario(tareaId, usuarioId);
        if (asignada) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
