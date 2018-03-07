package pl.edu.atena.biz.timers;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timer;

import pl.edu.atena.dao.PolisaDao;

@Startup
@Singleton
public class PolicyCountJob {
	
	private Logger log = Logger.getLogger("PolicyCountJob");
	@EJB PolisaDao polisaDao;

	@Schedule(second = "0", minute = "*", hour = "*")
	public void execute(Timer timer) {
		String ile = polisaDao.ilePolis();
		log.info("Iloœæ polis: " + ile + " czas:" + timer.getNextTimeout());
	}

	@PostConstruct
	public void init() {
		log.info("START");
	}

}
