/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *April 09, 2023
*/
package FinalProject.controller;

import java.util.List;

/**
 * @author uchin
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import FinalProject.beans.Animal;
import FinalProject.repository.AnimalRepository;

@Controller
public class WebController {
	@Autowired
	AnimalRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllAnimals(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewAnimal(model);
		}
		
		model.addAttribute("newAnimal", repo.findAll());
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
	
	@GetMapping("/sort")
	public String sortAnimalsByName(@RequestParam(name ="sort", required = false) String sortField, Model model){
	List<Animal> animals = null;
		
		if(sortField != null) {
			Sort sort = Sort.by(sortField);
			animals=repo.findAll(sort);
		}
		else if(sortField == null){
			System.out.println("null");
			animals = repo.findAll();
		}
		
		model.addAttribute("newAnimal", animals);
		return "results";
	}
	
	@GetMapping("/sortByUserInput")
	public String sortAnimalsWithField(@RequestParam(name="userInput", required = false) String userInput, Model model) {
		
		List<Animal> animals = repo.findAllSortedByUserInput(userInput);
		model.addAttribute("newAnimal", animals);
		return "results";
		
	}
	
}
