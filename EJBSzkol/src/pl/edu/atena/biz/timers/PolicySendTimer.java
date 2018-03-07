package pl.edu.atena.biz.timers;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timer;

import pl.edu.atena.biz.producers.PolicyNewToTopicProducer;
import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;

@Startup
@Singleton
public class PolicySendTimer {
	
	@EJB
	private PolicyNewToTopicProducer policyNewToTopicProducer;
	
	private Logger log = Logger.getLogger("PolicySendTimer");
	@EJB PolisaDao polisaDao;

	//@Schedule(second = "0", minute = "*", hour = "*")
	public void execute(Timer timer, Polisa polisa) {
		policyNewToTopicProducer.sendPolicy(polisa);
		log.info("Wysy³ka polisy timer:" + timer.getNextTimeout());
	}

	@PostConstruct
	public void init() {
		log.info("START");
	}

}
