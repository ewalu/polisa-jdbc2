package pl.edu.atena.biz.timers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import pl.edu.atena.biz.producers.PolicyNewToTopicProducer;
import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;


@Startup
@Singleton
public class PolicySendTimer {
	
	@Resource
	private TimerService ts;
	
	@EJB
	private PolicyNewToTopicProducer policyNewToTopicProducer;
	
	private Logger log = Logger.getLogger("PolicySendTimer");
	@EJB PolisaDao polisaDao;

	//@Schedule(second = "0", minute = "*", hour = "*")
	public void execute(Timer timer, Polisa polisa) {
		policyNewToTopicProducer.sendPolicy(polisa);
		log.info("Wysy³ka polisy timer: " +polisa.getNumerPolisy()+" "+timer.getNextTimeout());
	}
	
	public void create() {
		LocalDateTime ldt = LocalDateTime.now().plusSeconds(10);
		Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from(instant);
		ts.createTimer(date, "Mój Timer");
	}

	@Timeout
	public void runTimer(Timer timer) {
		log.info((String) timer.getInfo());
	}

}
