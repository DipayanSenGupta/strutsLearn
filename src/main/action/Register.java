package main.action;

import com.opensymphony.xwork2.ActionSupport;

import main.java.Person;

public class Register extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4399462923727169100L;
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
	
	public void validate() {
		if(personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required");
		}
		
	    if (personBean.getEmail().length() == 0) {
	        addFieldError("personBean.email", "Email is required.");
	    }

	    if (personBean.getAge() < 18) {
	        addFieldError("personBean.age", "Age is required and must be 18 or older");
	    }
	}
}
