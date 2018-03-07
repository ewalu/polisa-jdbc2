package pl.edu.atena.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.Query;

import pl.edu.atena.biz.producers.PolicyNewProducer;
import pl.edu.atena.biz.producers.PolicyNewToTopicProducer;
import pl.edu.atena.biz.timers.PolicyCountTimer;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.StatusPolisy;
import pl.edu.atena.entities.Ubezpieczajacy;

import static javax.ejb.TransactionAttributeType.*;

@Stateless
public class PolisaDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	@EJB
	private PolicyNewProducer policyNewProducer;
	@EJB
	private PolicyNewToTopicProducer policyNewToTopicProducer;
	@EJB
	private PolicyCountTimer policyCountTimer;
	
	@EJB AudytDao audytDao;
	
	@TransactionAttribute(REQUIRES_NEW)
	public void create (Polisa polisa) {
		em.persist(polisa);
		audytDao.loguj("tworzenie polisy "+ polisa.getNumerPolisy());
		
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
		Query query = em.createQuery("select p from Polisa p "
				+"join fetch p.agenci "
				+ "where p.numerPolisy = :numerPolisy");
		query.setParameter("numerPolisy", numer);
		return (Polisa) query.getSingleResult();
	}
	
	public List<Polisa> szukajPoStatusie (StatusPolisy status) {
		Query query = em.createQuery("select p from Polisa p where p.status = :statusPolisy");
		query.setParameter("statusPolisy", status);
		return (List<Polisa>) query.getResultList();
	}
	
	public String ilePolis () {
		Query query = em.createQuery("select count(*) from Polisa p");
		return query.getResultList().toString();
	}
	
	@PrePersist
	private void beforeCreate(Polisa object) {
		System.out.println("Walidacja ...." + object);
}
	

}
