package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, String> {
}
