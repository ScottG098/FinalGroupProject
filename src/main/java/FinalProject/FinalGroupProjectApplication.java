package FinalProject;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import FinalProject.beans.Animal;
import FinalProject.beans.Owner;
import FinalProject.controller.BeanConfiguration;
import FinalProject.repository.AnimalRepository;

@SpringBootApplication
public class FinalGroupProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalGroupProjectApplication.class, args);
	}
	@Autowired
	AnimalRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Animal c = appContext.getBean("contact", Animal.class);
		c.setDate_of_birth("dd/MM/yyyy");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		Animal d = new Animal("Binnie", "Dog", "07/09/2021",2000);
		Owner a = new Owner("Emily Hove","7789 James Street", "Des Moines","IA","555-555-4444");
		d.setOwner(a);
		repo.save(d);
		
		List<Animal> allMyAnimals = repo.findAll();
		for(Animal species: allMyAnimals) {
			System.out.println(species.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();

	}

}

