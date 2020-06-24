package main.action;

import main.java.Person;

public class Register {

	private Person personBean;
	
	public String execute() throws Exception {
		return "success";
	}
	
	public Person getPersonBean() {
		return personBean;
	}
	
	public void setPersonBean(Person person) {
		personBean = person;
	}
}
