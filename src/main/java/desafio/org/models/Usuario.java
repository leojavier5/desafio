package desafio.org.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UsuarioId;

    private String nombreUsuario;

    private String correoelectronicoUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<Tarea> tareas;

}

