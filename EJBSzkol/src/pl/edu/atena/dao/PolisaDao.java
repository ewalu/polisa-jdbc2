package pl.edu.atena.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		System.out.println(em.contains(polisa));
		if (polisa != null) {
			em.remove(polisa);
		}
	}
	
	public Polisa szukajPoNumerze (String numer) {
		Query query = em.createQuery("select p from Polisa p where p.numerPolisy = :numerPolisy");
		query.setParameter("numerPolisy", numer);
		return (Polisa) query.getSingleResult();
	}
	

}
