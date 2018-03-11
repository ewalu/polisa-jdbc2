package pl.edu.atena.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "polisa",
uniqueConstraints = {@UniqueConstraint(columnNames= {"numerPolisy"})},
schema = "public",
indexes = {@Index(columnList = "numerPolisy")}
)

@XmlRootElement
public class Polisa implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Transient
	private Long idTemp;
	private String numerPolisy;
	private String ubezpieczajacy;
	private BigDecimal skladka;
	
	@ManyToMany (fetch = FetchType.EAGER)
	private List<Agent> agenci;
	
	@OneToMany (fetch = FetchType.EAGER)
	private List<Ryzyko> ryzyka;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date wr = Date.from(Instant.now());
	
	@Temporal(TemporalType.DATE)
	private Date signDate = Date.from(Instant.now());
	
	@Enumerated(EnumType.STRING)
	private StatusPolisy status;
	
	/*public Polisa() {
		Random r = new Random();
		this.numerPolisy = "EWA"+LocalDate.now()+-+r.nextInt(1000);
		this.skladka = BigDecimal.valueOf(r.nextInt(1000));
	}*/
	
	public Long getId() {
		return id;
	}
	@XmlAttribute
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumerPolisy() {
		return numerPolisy;
	}
	@XmlElement
	public void setNumerPolisy(String numerPolisy) {
		this.numerPolisy = numerPolisy;
	}
	public String getUbezpieczajacy() {
		return ubezpieczajacy;
	}
	public BigDecimal getSkladka() {
		return skladka;
	}
	@XmlElement
	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}
	@XmlElement
	public void setUbezpieczajacy(String ubezpieczajacy) {
		this.ubezpieczajacy = ubezpieczajacy;
	}
	public Long getIdTemp() {
		return idTemp;
	}
	public void setIdTemp(Long idTemp) {
		this.idTemp = idTemp;
	}
	public Date getWr() {
		return wr;
	}
	@XmlElement
	public void setWr(Date wr) {
		this.wr = wr;
	}
	public Date getSignDate() {
		return signDate;
	}
	@XmlElement
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}
	public StatusPolisy getStatus() {
		return status;
	}
	@XmlElement
	public void setStatus(StatusPolisy status) {
		this.status = status;
	}
	public List<Agent> getAgenci() {
		return agenci;
	}
	public void setAgenci(List<Agent> agenci) {
		this.agenci = agenci;
	}
	public List<Ryzyko> getRyzyka() {
		return ryzyka;
	}
	public void setRyzyka(List<Ryzyko> ryzyka) {
		this.ryzyka = ryzyka;
	}
	@Override
	public String toString() {
		return "Polisa [numerPolisy=" + numerPolisy + ", ubezpieczajacy=" + ubezpieczajacy + ", skladka=" + skladka
				+ ", signDate=" + signDate + ", status=" + status + "]";
	}

}
