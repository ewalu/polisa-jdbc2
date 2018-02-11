package pl.edu.atena.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ryzyko", schema = "public")
public class Ryzyko {
	
	@Id
	@GeneratedValue
	private Long id;
	private SymbolRyzyka symbol;
	private BigDecimal skladka;
	
	@ManyToOne (optional = true, fetch = FetchType.EAGER)
	private Polisa polisa;
	
	@OneToOne
	private Ubezpieczony ubezpieczony;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SymbolRyzyka getSymbol() {
		return symbol;
	}

	public void setSymbol(SymbolRyzyka symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getSkladka() {
		return skladka;
	}

	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}

	public Polisa getPolisa() {
		return polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}

}
