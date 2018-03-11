package pl.edu.atena.biz.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PolisaEvent {
	
	Typ value();
	enum Typ {
		ZATWIERDZ, ZAWIESZ
	}
	
	
}
