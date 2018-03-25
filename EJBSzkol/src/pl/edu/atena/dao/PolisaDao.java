package pl.edu.atena.dao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.Query;

import pl.edu.atena.biz.interceptors.CzasTrwaniaMetodyLogger;
import pl.edu.atena.biz.producers.PolicyNewProducer;
import pl.edu.atena.biz.producers.PolicyNewToTopicProducer;
import pl.edu.atena.biz.timers.PolicyCountTimer;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.StatusPolisy;
import pl.edu.atena.entities.Ubezpieczajacy;

import static javax.ejb.TransactionAttributeType.*;

@Stateless
@Interceptors(CzasTrwaniaMetodyLogger.class)
public class PolisaDao {
	@PersistenceContext(unitName = "PolisaPU")
	private EntityManager em;
	
	@EJB
	private PolicyNewProducer policyNewProducer;
	@EJB
	private PolicyNewToTopicProducer policyNewToTopicProducer;
	@EJB
	private PolicyCountTimer policyCountTimer;
	
	private Logger log = Logger.getLogger("PolicyTimer");
	
	@EJB AudytDao audytDao;
	
	@TransactionAttribute(REQUIRES_NEW)
	public void create (Polisa polisa) {
		em.persist(polisa);
		//timer polisy
		/*Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
				  policyNewToTopicProducer.sendPolicy(polisa);
				  log.info("Wysy³ka polisy jej timer: " +polisa.getNumerPolisy());
			  }
			}, 15*1000, 60*1000);*/
		//timer.cancel();
		
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
				//+"join fetch p.agenci "
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
