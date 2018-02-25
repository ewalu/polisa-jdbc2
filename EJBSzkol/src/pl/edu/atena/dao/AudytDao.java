package pl.edu.atena.dao;

import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.edu.atena.entities.Audyt;
import pl.edu.atena.entities.Ubezpieczajacy;

@Stateless
public class AudytDao {
	
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	@TransactionAttribute(REQUIRES_NEW)
	public void create (Audyt audyt) {
		em.persist(audyt);
		
		//throw new NullPointerException();
	}

}
