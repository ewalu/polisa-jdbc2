package pl.edu.atena.entities;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDateTime;
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
	private LocalDateTime data = LocalDateTime.now();
	
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
	public BigDecimal getSkladka() {
		return skladka;
	}
	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public void setUbezpieczajacy(String ubezpieczajacy) {
		this.ubezpieczajacy = ubezpieczajacy;
	}

}
