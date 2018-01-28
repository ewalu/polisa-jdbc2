package pl.edu.atena.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.edu.atena.entities.Ubezpieczony;

@Stateless
public class UbezpieczonyDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	public void create (Ubezpieczony ubezp) {
		em.persist(ubezp);
	}
}