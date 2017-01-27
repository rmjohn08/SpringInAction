package net.rmj.spring.sia.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.rmj.spring.sia.beans.RegistrationForm;
import net.rmj.spring.sia.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittleRepository repository;

	@Autowired
	public SpittleController(SpittleRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute("spittleList", repository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}

	/*
	 * @RequestMapping(method = RequestMethod.GET) public List<Spittle>
	 * spittles(@RequestParam("max") long max, @RequestParam("count") int count)
	 * { return repository.findSpittles(max, count); }
	 */
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationForm() {
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@Valid RegistrationForm form, Errors errors) {
	
		repository.addSpitter(form);
		return "redirect:/spitter/" + form.getUserName();
	}

}
