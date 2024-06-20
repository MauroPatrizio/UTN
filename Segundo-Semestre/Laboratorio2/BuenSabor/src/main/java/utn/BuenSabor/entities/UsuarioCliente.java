package utn.BuenSabor.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "usuario_cliente")
public class UsuarioCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String auth0Id;
    private String username;

    public UsuarioCliente() {}

    public UsuarioCliente(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
