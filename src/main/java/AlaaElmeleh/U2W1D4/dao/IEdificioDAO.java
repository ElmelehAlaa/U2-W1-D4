package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Edificio;
import AlaaElmeleh.U2W1D4.entities.Postazione;

import java.util.List;

public interface IEdificioDAO {
    public void save(Edificio edificio);


    public void findByIdAndUpdate(long id, Edificio edificio);

    public void findByIdAndDelete(long id);

    public Edificio findById(long id);

    public List<Edificio> findAll();

    public long count();
}
