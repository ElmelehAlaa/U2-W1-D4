package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class EdificioService implements IEdificioDAO {

    @Autowired
    private EdificioRepository edificioRepo;
    @Override
    public void save(Edificio edificio) {
     edificioRepo.save(edificio);
        log.info(edificio.getId() + " salvato correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, Edificio edificio) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Edificio findById(long id) {
        return null;
    }

    @Override
    public List<Edificio> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
