package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UtenteService implements IUtenteDAO {
    @Autowired
    private UtenteRepository utenteRepository;

    @Override
    public void save(Utente utente) {

    }

    @Override
    public void findByIdAndUpdate(long id, Utente utente) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Utente findById(long id) {
        return null;
    }

    @Override
    public List<Utente> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
