/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *April 09, 2023
*/
package FinalProject.controller;

/**
 * @author uchin
 *
 */
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import FinalProject.repository.AnimalRepository;
import FinalProject.beans.Animal;

@Controller
public class WebController {
	@Autowired
	AnimalRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllAnimals(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewAnimal(model);
		}
		
		model.addAttribute("animals", repo.findAll());
		return "results";
	}

	@GetMapping({"/inputAnimal"})
	public String addNewAnimal(Model model) {
		Animal c = new Animal();
		model.addAttribute("newAnimal", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateAnimal(@PathVariable("id") long id, Model model) {
		Animal c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newAnimal", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseAnimal(Animal c, Model model) {
		repo.save(c);
		return viewAllAnimals(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Animal c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllAnimals(model);
	}
}
