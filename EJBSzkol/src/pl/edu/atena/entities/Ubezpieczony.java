package pl.edu.atena.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ubezpieczony", schema = "public")
public class Ubezpieczony {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nazwa;
	
	@OneToOne (fetch = FetchType.EAGER)
	private Ryzyko ryzyko;

}
