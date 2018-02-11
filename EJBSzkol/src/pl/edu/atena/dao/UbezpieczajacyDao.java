package pl.edu.atena.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ryzyko;
import pl.edu.atena.entities.Ubezpieczajacy;

@Stateless
public class UbezpieczajacyDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	public void create (Ubezpieczajacy ubezp) {
		em.persist(ubezp);
	}
	
	public Ubezpieczajacy find(Long id) {
		return em.find(Ubezpieczajacy.class,id);
	}
	
	public void refresh(Ubezpieczajacy ubezp) {
		em.refresh(ubezp);
	}
	
	public Ubezpieczajacy dodajPolise(Long id, Polisa polisa) {
		Ubezpieczajacy ubezp = find(id);
		ubezp.setPolisa(polisa);
		return ubezp;
	}
	
	public Ubezpieczajacy szukajPoNazwie (String nazwa) {
		Query query = em.createQuery("select u from Ubezpieczajacy u "
				+"left join u.polisa "
				+ "where u.nazwa = :nazwaUb");
		query.setParameter("nazwaUb", nazwa);
		return (Ubezpieczajacy) query.getSingleResult();
	}
	
}