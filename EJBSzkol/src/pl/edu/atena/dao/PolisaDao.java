package pl.edu.atena.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.edu.atena.entities.Polisa;

@Stateless
public class PolisaDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	public void create (Polisa polisa) {
		em.persist(polisa);
	}
	
	public Polisa find(Long id) {
		return em.find(Polisa.class,id);
	}
	
	public Polisa update(Long id, String ubezpieczajacy) {
		Polisa polisaup = find(id);
		polisaup.setUbezpieczajacy(ubezpieczajacy);
		return polisaup;
	}
	
	public void delete(Long id) {
		Polisa polisa = find(id);
		em.remove(polisa);
	}
	

}
