package pl.edu.atena.jsf;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.StatusPolisy;

@ManagedBean
@ViewScoped
public class PolisaAction {
	
	@Inject
	private PolisaDao dao;
	
	private Polisa polisa;
	
	private StatusPolisy[] statusy = StatusPolisy.values();
	
	@PostConstruct
	private void init() {
		String idPolisy = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idPolisy");
		
		if (idPolisy == null) {
			polisa = new Polisa();
		} else {
			polisa = dao.find(Long.valueOf(idPolisy));
		}
	}
	
	public void zapisz() {
		if (polisa.getId() == null) {
			dao.create(polisa);
		} else {
			dao.update2(polisa);
		}
	}

	public PolisaDao getDao() {
		return dao;
	}

	public void setDao(PolisaDao dao) {
		this.dao = dao;
	}

	public Polisa getPolisa() {
		return polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Wybrano datę", format.format(event.getObject())));
    }

	public StatusPolisy[] getStatusy() {
		return statusy;
	}

	public void setStatusy(StatusPolisy[] statusy) {
		this.statusy = statusy;
	}
	
	public String lista() {
		return "lista";
	}

}
