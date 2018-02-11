package pl.edu.atena.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ubezpieczony {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nazwa;
	
	@OneToOne (fetch = FetchType.EAGER)
	private Ryzyko ryzyko;

}
