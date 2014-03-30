package com.chromia.util;

/**
 * @author Ariel Duarte
 */
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

//Esta clase se encarga de controlar sin un usuario esta logueado

public class AuthorizationListener implements PhaseListener{

	
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
		FacesContext facesContex = event.getFacesContext();
		String currentPage = facesContex.getViewRoot().getViewId();
		boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml")>-1 ? true : false);
		HttpSession sesion = (HttpSession) facesContex.getExternalContext().getSession(true);
		Object usuario = sesion.getAttribute("usuario");
		
		if(!isLoginPage && usuario == null){
			NavigationHandler nh = facesContex.getApplication().getNavigationHandler();
			nh.handleNavigation(facesContex, null, "/login.xhtml");
		}
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}


}
