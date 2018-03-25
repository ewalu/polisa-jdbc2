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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Ryzyko getRyzyko() {
		return ryzyko;
	}

	public void setRyzyko(Ryzyko ryzyko) {
		this.ryzyko = ryzyko;
	}

}
