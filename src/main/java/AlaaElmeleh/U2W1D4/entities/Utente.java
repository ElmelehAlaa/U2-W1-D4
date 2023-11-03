package AlaaElmeleh.U2W1D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Utenti")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
    @Id
    private String username;
    private String nomeCompleto;
    private String email;
}
