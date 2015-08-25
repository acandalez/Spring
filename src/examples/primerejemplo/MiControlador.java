package examples.primerejemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * con controller convertimos nuestra clase de java en nuestro controlador de
 * spring.
 * 
 * @author acandalez
 *
 */
@Controller
public class MiControlador {

	@RequestMapping("/bienvenido2")
	public String holaMundo2(
			@RequestParam(value = "name", required = false, defaultValue = "Mundo") String name,
			Model model) {
		model.addAttribute("name", name);
		return "bienvenido2";
	}

}
