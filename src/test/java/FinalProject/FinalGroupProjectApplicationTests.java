
/**
 *@author Uday F Chinhamora- ufchinhamora

*CIS175 -Spring 2023
 *April 24, 2023
*/

package FinalProject;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import FinalProject.beans.Animal;
import FinalProject.beans.Owner;
import FinalProject.beans.VetRecord;
import FinalProject.beans.WaitingListOwner;


@RunWith(SpringRunner.class)
@SpringBootTest
class FinalGroupProjectApplicationTests {
	


	@Test
	public void test_animal_default_constructor() {
	Animal animal = new Animal();
	
	animal.setName("Shan");
	assertEquals("Shan",animal.getName());
	
	animal.setName("Uday");
	assertEquals("Uday",animal.getName());
	
	animal.setBreed("Dog");
	assertEquals("Dog",animal.getBreed());
	
	animal.setDate_of_birth("11/24/2022");
	assertEquals("11/24/2022",animal.getDate_of_birth());
	
	animal.setBreed("Cat");
	assertEquals("Cat",animal.getBreed());
	}
	
	@Test
	public void test_owner_default_constructor() {
	Owner owner = new Owner();
	
	owner.setAddress("789 Amon 5th Street ,Ankeny");
	assertEquals("789 Amon 5th Street ,Ankeny",owner.getAddress());
	
	owner.setCity("DesMoines");
	assertEquals("DesMoines",owner.getCity());
	
	owner.setOwner_name("Dilan Moire");
	assertEquals("Dilan Moire",owner.getOwner_name());
	
	owner.setPhoneNumber("9997778888");
	assertEquals("9997778888",owner.getPhoneNumber());
	
	owner.setState("Iowa");
	assertEquals("Iowa",owner.getState());
	
	
}
	@Test
	public void test_VetRecord_default_constructor() {
	VetRecord vetrecord = new VetRecord();
	
	vetrecord.setPetName("Danger");
	assertEquals("Danger",vetrecord.getPetName());
	
	vetrecord.setRecordDate("12/05/2021");
	assertEquals("12/05/2021",vetrecord.getRecordDate());
	
	vetrecord.setRecordType("Form");
	assertEquals("Form",vetrecord.getRecordType());
	
	vetrecord.setVetID("999");
	assertEquals("999",vetrecord.getVetID());
	
	
}
	@Test
	public void test_WaitingListOwner_default_constructor() {
		WaitingListOwner waitinglistowner = new WaitingListOwner();
		
		waitinglistowner.setOwner_name("Patrick Bay");
		assertEquals("Patrick Bay",waitinglistowner.getOwner_name());
		
		waitinglistowner.setPhoneNumber("5550005555");
		assertEquals("5550005555",waitinglistowner.getPhoneNumber());
		
		waitinglistowner.setState("Texas");
		assertEquals("Texas",waitinglistowner.getState());
		
		waitinglistowner.setCity("Urbandale");
		assertEquals("Urbandale",waitinglistowner.getCity());
		
		waitinglistowner.setAddress(" 555 7th Street");
		assertEquals(" 555 7th Street",waitinglistowner.getAddress());
		
}
}