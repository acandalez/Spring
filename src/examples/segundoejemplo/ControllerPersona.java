package examples.segundoejemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Este es mi controlador de personas
 * 
 */
@Controller
public class ControllerPersona {

	@RequestMapping(path = "/personaction", method = RequestMethod.POST)
	public String formularioPersona(@ModelAttribute Persona persona, Model model) {

		System.out.println("Edad = " + persona.getEdad());
		System.out.println("Nombre = " + persona.getNombre());
		System.out.println("Descripcion = " + persona.getDescripcion());
		model.addAttribute("personita", persona);
		return "datospersona";
	}

}
