package FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import FinalProject.beans.VetRecord;
import FinalProject.repository.VetRecordRepository;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 21, 2023
 */

@Controller
public class RecordWebController {
		@Autowired
		VetRecordRepository repo;

		@GetMapping({ "viewAllRecords" })
		public String viewAllVetRecords(Model model) {
			if(repo.findAll().isEmpty()) {
				return addNewVetRecord(model);
			}
			
			model.addAttribute("vet_record", repo.findAll());
			return "recordresults";
		}

		@GetMapping({"/inputRecord"})
		public String addNewVetRecord(Model model) {
			VetRecord c = new VetRecord();
			model.addAttribute("newRecord", c);
			return "inputrecord";
		}

		@GetMapping("/editRecord/{id}")
		public String showUpdateRecord(@PathVariable("id") long id, Model model) {
			VetRecord c = repo.findById(id).orElse(null);
			System.out.println("ITEM TO EDIT: " + c.toString());
			model.addAttribute("newRecord", c);
			return "inputrecord";
		}

		@PostMapping("/updateRecord/{id}")
		public String reviseAnimal(VetRecord c, Model model) {
			repo.save(c);
			return viewAllVetRecords(model);
		}
		
		@GetMapping("/deleteRecord/{id}")
		public String deleteUser(@PathVariable("id") long id, Model model) {
			VetRecord c = repo.findById(id).orElse(null);
		    repo.delete(c);
		    return viewAllVetRecords(model);
		}
	}

