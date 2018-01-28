package pl.edu.atena.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Polisa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String numerPolisy;
	private String ubezpieczajacy;
	private BigDecimal skladka;
	
	/*public Polisa() {
		Random r = new Random();
		this.numerPolisy = "EWA"+LocalDate.now()+-+r.nextInt(1000);
		this.skladka = BigDecimal.valueOf(r.nextInt(1000));
	}*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumerPolisy() {
		return numerPolisy;
	}
	public void setNumerPolisy(String numerPolisy) {
		this.numerPolisy = numerPolisy;
	}
	public String getUbezpieczajacy() {
		return ubezpieczajacy;
	}
	public void setUbezpieczaj¹cy(String ubezpieczajacy) {
		this.ubezpieczajacy = ubezpieczajacy;
	}
	public BigDecimal getSkladka() {
		return skladka;
	}
	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}

}
