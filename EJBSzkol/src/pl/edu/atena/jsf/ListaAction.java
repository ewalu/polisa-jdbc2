package pl.edu.atena.jsf;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;

@ManagedBean
@ViewScoped
public class ListaAction {
	
	@Inject
	private PolisaDao dao;
	
	private List<Polisa> polisy;
	
	@PostConstruct
	private void init() {
		polisy = dao.select();
	}

	public List<Polisa> getPolisy() {
		return polisy;
	}
	
	public String nowa() {
		return "nowa";
	}
	
	public String edytuj() {
		return "edytuj";
	}
	

}
