package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PrenotazioneService implements IPrenotazioniDAO {
    @Autowired
    private PrenotazioniRepository prenotazioniRepo;

    @Override
    public void save(Prenotazione prenotazione) {
        prenotazioniRepo.save(prenotazione);
        log.info(prenotazione.getId() + " salvato correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, Prenotazione prenotazione) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Prenotazione findById(long id) {
        return null;
    }

    @Override
    public List<Prenotazione> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
