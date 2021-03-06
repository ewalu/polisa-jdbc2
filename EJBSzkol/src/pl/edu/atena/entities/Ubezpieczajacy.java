package pl.edu.atena.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "ubezpieczajacy", schema = "public")
public class Ubezpieczajacy {
	@Id
	@GeneratedValue
	private Long id;
	private String nazwa;
	
	@OneToOne
	private Polisa polisa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}
	
	
	@XmlElement(name = "NAME")
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Polisa getPolisa() {
		return polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}

}
