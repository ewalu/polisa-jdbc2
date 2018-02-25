package pl.edu.atena.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "audyt")
public class Audyt {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date Data = Date.from(Instant.now());
	private String komunikat;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data =  data;
	}
	public String getKomunikat() {
		return komunikat;
	}
	public void setKomunikat(String komunikat) {
		this.komunikat = komunikat;
	}
}
