package desafio.org.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comentarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ComentarioId;

    private String textoComentario;

    private int fechaComentario;

    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;

}
