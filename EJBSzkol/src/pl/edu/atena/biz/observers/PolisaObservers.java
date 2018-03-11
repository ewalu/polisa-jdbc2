package pl.edu.atena.biz.observers;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import pl.edu.atena.biz.annotations.PolisaEvent;
import pl.edu.atena.biz.annotations.PolisaEvent.Typ;
import pl.edu.atena.entities.Polisa;

@Stateless
public class PolisaObservers {
	
	private Logger log = Logger.getLogger("PolisaObserwator");
	
	public void zatwierdzeniePolisy (@Observes @PolisaEvent(Typ.ZATWIERDZ) Polisa polisa) {
		log.info("Otrzyma³em zatwierdzon¹ polisê:" + polisa);
		
	}
	
	public void usunPolisy (@Observes @PolisaEvent(Typ.ZAWIESZ) Polisa polisa) {
		log.info("Otrzyma³em zawieszon¹ polisê:" + polisa);
		
	}

}
