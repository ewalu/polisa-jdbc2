package pl.edu.atena.entities;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audytczasy")
public class AudytCzasy {
	
	@Id
	@GeneratedValue
	private Long id;
	private String klasa;
	private String metoda;
	private Instant start;
	private String params;
	private Long czas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKlasa() {
		return klasa;
	}
	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}
	public String getMetoda() {
		return metoda;
	}
	public void setMetoda(String metoda) {
		this.metoda = metoda;
	}
	public Instant getStart() {
		return start;
	}
	public void setStart(Instant start) {
		this.start = start;
	}
	public Long getCzas() {
		return czas;
	}
	public void setCzas(Long czas) {
		this.czas = czas;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
}
	
