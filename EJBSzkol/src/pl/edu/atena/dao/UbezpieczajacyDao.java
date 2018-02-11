package pl.edu.atena.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ubezpieczony;

@Stateless
public class UbezpieczonyDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	public void create (Ubezpieczony ubezp) {
		em.persist(ubezp);
	}
	
	public Ubezpieczony find(Long id) {
		return em.find(Ubezpieczony.class,id);
	}
	
	public void refresh(Ubezpieczony ubezp) {
		em.refresh(ubezp);
	}
	
	public Ubezpieczony dodajPolise(Long id, Polisa polisa) {
		Ubezpieczony ubezp = find(id);
		ubezp.setPolisa(polisa);
		return ubezp;
	}
}