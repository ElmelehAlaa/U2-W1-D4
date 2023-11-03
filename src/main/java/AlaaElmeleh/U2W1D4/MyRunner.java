package AlaaElmeleh.U2W1D4;

import AlaaElmeleh.U2W1D4.Enum.Tipo;
import AlaaElmeleh.U2W1D4.dao.IEdificioDAO;
import AlaaElmeleh.U2W1D4.dao.IPostazioneDAO;
import AlaaElmeleh.U2W1D4.entities.Edificio;
import AlaaElmeleh.U2W1D4.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {

    @Autowired
    private IPostazioneDAO postazioneDAO;


    @Autowired
    private IEdificioDAO edificioDAO;

    @Override
    public void run(String... args) throws Exception {
        Edificio provaEdificio = new Edificio("Palazzo","via Enrico fermi","Tivoli");
Postazione provaPostazione = new Postazione("descrizione", Tipo.PRIVATO,20,provaEdificio);
edificioDAO.save(provaEdificio);
postazioneDAO.save(provaPostazione);


    }
}
