package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioniService implements IPostazioneDAO {

    @Autowired
    private PostazioniRepository postazioniRepository;
    @Override
    public void save(Postazione postazione) {
        postazioniRepository.save(postazione);
        log.info(postazione.getId() + " salvato correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, Postazione postazione) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Postazione findById(long id) {
        return null;
    }

    @Override
    public List<Postazione> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
