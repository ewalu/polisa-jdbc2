package pl.edu.atena.biz.interceptors;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

import pl.edu.atena.dao.AudytCzasDao;

public class CzasTrwaniaMetodyLogger {
	
	@EJB AudytCzasDao audytcdao;
	
	@AroundInvoke
	public Object liczCzas(InvocationContext invocation) throws Exception{
		
		Instant start = Instant.now();
		try {
			return invocation.proceed();
		} finally {
			long milis = Duration.between(start, Instant.now()).toMillis();
			String clazz = invocation.getTarget().getClass().getCanonicalName();
			String method = invocation.getMethod().getName();
			String par = Arrays.asList(invocation.getParameters()).toString();
			Logger log = Logger.getLogger(clazz);
			log.info(clazz+'-'+method+':'+start+'-'+milis+'-'+par);
			audytcdao.loguj(clazz, method, start, milis, par);
		}
		
	}

}
