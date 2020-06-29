package main.service;

import main.java.Person;

public class EditServiceInMemory implements EditService{
	private static Person person;
	private static String [] carModels = {"Ford", "Nissan"};
	
	static {
		person = new Person();
		person = new Person();
		person.setFirstName("Bruce");
		person.setLastName("Phillips");
		person.setEmail("bphillips@ku.edu");
		person.setPhoneNumber("01680039062");
		person.setSport("basketball");
		person.setGender("not sure");
		person.setResidency("KS");
		person.setOver21(true);		
		person.setCarModels( carModels);	
		}
	public Person getPerson() {
		return EditServiceInMemory.person;
	}
	
	public void savePerson(Person personBean) {

		EditServiceInMemory.person.setFirstName(personBean.getFirstName() );
		EditServiceInMemory.person.setLastName(personBean.getLastName() );
		EditServiceInMemory.person.setSport(personBean.getSport() );
		EditServiceInMemory.person.setGender( personBean.getGender() );
		EditServiceInMemory.person.setResidency( personBean.getResidency() );
		EditServiceInMemory.person.setOver21( personBean.isOver21() );
		EditServiceInMemory.person.setCarModels(personBean.getCarModels() );
		EditServiceInMemory.person.setEmail( personBean.getEmail() );
		EditServiceInMemory.person.setPhoneNumber( personBean.getPhoneNumber() );


	}
}
