package pl.edu.atena.biz.timers;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Timer;

public class PolicyCountJob {
	
	private Logger log = Logger.getLogger("PolicyJob");

	//@Schedule(second = "0", minute = "*", hour = "*")
	public void execute(Timer timer) {
		log.info("Iloœc polis: " + timer.getNextTimeout());
	}

	@PostConstruct
	public void init() {
		log.info("START");
	}

}
