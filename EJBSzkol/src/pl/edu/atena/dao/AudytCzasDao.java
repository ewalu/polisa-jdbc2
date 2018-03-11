package pl.edu.atena.dao;

import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;

import java.time.Instant;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.edu.atena.entities.AudytCzasy;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AudytCzasDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	@TransactionAttribute(REQUIRES_NEW)
	public void create (AudytCzasy audytc) {
		em.persist(audytc);
		
		//throw new NullPointerException();
	}

	public void loguj (String klasa, String metoda, Instant start, Long czas, String params) {
		AudytCzasy audytc = new AudytCzasy();
		audytc.setKlasa(klasa);
		audytc.setMetoda(metoda);
		audytc.setStart(start);
		audytc.setCzas(czas);
		audytc.setParams(params);
		em.persist(audytc);
	}
}
