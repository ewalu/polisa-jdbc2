package pl.edu.atena.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agent", schema = "public")
public class Agent {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nazwa;
	
	@ManyToMany(cascade=CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name="AGENCI_POLISY", foreignKey = @ForeignKey(name = "FK_AGENT_TO_POL"), schema = "public")
	private List<Polisa> polisy;

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

	public List<Polisa> getPolisy() {
		return polisy;
	}

	public void setPolisy(List<Polisa> polisy) {
		this.polisy = polisy;
	}

}
