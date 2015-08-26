package examples.tercerejemplo;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * Controlador de idiomas.
 * 
 * @author acandalez
 *
 */
@Controller
public class ControllerEjemplo3 {

	@RequestMapping("/rajoy")
	public String rajao() {
		return "rajoy";
	}

	@RequestMapping("/rajoyi")
	public String rajaoDefecto(HttpServletRequest request,
			HttpServletResponse response) {

		// esto nos indica el idioma con el que esta funcionando nuestra
		// aplicacion.
		Locale locale = RequestContextUtils.getLocale(request);
		System.out.println("idioma que estamos usando actualmente: " + locale);

		// con el siguiente codigo podemos cambiar el idioma que usa por defecto
		// por otro.
		RequestContextUtils.getLocaleResolver(request).setLocale(request,
				response, new Locale("es_VE"));
		;

		return "rajoyi";
	}

}
