package AlaaElmeleh.U2W1D4.dao;

import AlaaElmeleh.U2W1D4.entities.Prenotazione;

import java.util.List;

public interface IPrenotazioniDAO {
    public void save(Prenotazione prenotazione);


    public void findByIdAndUpdate(long id, Prenotazione prenotazione);

    public void findByIdAndDelete(long id);

    public Prenotazione findById(long id);

    public List<Prenotazione> findAll();

    public long count();
}
