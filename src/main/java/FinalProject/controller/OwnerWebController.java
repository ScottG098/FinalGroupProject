package FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import FinalProject.repository.WaitingListOwnerRepository;
import FinalProject.beans.Animal;
import FinalProject.beans.WaitingListOwner;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 11, 2023
 */

@Controller
public class OwnerWebController {
	@Autowired
	WaitingListOwnerRepository repo;
	
	@GetMapping({"/viewAllOwners" })
	public String viewAllOwners(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewOwner(model);
		}
		
		model.addAttribute("waiting_list_owners", repo.findAll());
		return "ownerresults";
	}

	@GetMapping({"/inputOwner"})
	public String addNewOwner(Model model) {
		WaitingListOwner c = new WaitingListOwner();
		model.addAttribute("newOwner", c);
		return "inputowner";
	}

	@GetMapping("/editOwner/{id}")
	public String showUpdateOwner(@PathVariable("id") long id, Model model) {
		WaitingListOwner c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newOwner", c);
		return "inputowner";
	}

	@PostMapping("/updateOwner/{id}")
	public String reviseOwner(WaitingListOwner c, Model model) {
		repo.save(c);
		return viewAllOwners(model);
	}
	
	@GetMapping("/deleteOwner/{id}")
	public String deleteOwner(@PathVariable("id") long id, Model model) {
		WaitingListOwner c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllOwners(model);
	}
	
	@GetMapping("/sortOwners")
	public String sortOwnersByName(@RequestParam(name ="sort", required = false) String sortField, Model model){
	List<WaitingListOwner> owner = null;
		
		if(sortField != null) {
			Sort sort = Sort.by(sortField);
			owner=repo.findAll(sort);
		}
		else if(sortField == null){
			System.out.println("null");
			owner = repo.findAll();
		}
		
		model.addAttribute("waiting_list_owners", owner);
		return "ownerresults";
	}

}
