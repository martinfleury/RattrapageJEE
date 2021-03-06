package package2;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

import package1.AttenteService;

public class AttenteServiceProvider {
	
	private static final String ATTENTE_SERVICE_NOM = "attenteService";
	
	private AttenteServiceProvider() {
	}
	
	public static AttenteService get(ServletRequest req) {
		return (AttenteService) req.getServletContext().getAttribute(ATTENTE_SERVICE_NOM);
	}
	
	public static void init(ServletContext sc) {
		sc.setAttribute(ATTENTE_SERVICE_NOM, new AttenteService());
	}

}
