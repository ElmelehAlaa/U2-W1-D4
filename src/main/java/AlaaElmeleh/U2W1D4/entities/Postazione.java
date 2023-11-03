package AlaaElmeleh.U2W1D4.entities;

import AlaaElmeleh.U2W1D4.Enum.Stato;
import AlaaElmeleh.U2W1D4.Enum.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "Postazioni")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int numeroMassimoOccupanti;
    @Enumerated(EnumType.STRING)
    private Stato stato;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public Postazione(String descrizione, Tipo tipo, int numeroMassimoOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
        this.edificio = edificio;
    }
}


