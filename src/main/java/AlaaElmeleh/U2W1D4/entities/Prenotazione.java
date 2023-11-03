package AlaaElmeleh.U2W1D4.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPrenotazione;
    private LocalDate finePrenotazione = dataPrenotazione.plusDays(1);

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
}
