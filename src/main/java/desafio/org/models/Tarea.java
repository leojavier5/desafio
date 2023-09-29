package desafio.org.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Tareas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Tarea {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long TareaId;

    private String tituloTarea;

    private String descripcionTarea;

    private Date fechadevencimientoTarea;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "tarea")
    private List<Comentario> comentarios;

}
