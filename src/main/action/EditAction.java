package main.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import main.java.Person;
import main.java.State;
import main.service.EditService;
import main.service.EditServiceInMemory;

public class EditAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 57433143275641534L;
	private EditService editService = new EditServiceInMemory();
	private Person personBean;
private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

	public String execute() throws Exception {
		editService.savePerson(getPersonBean());
		return "success";
	}
	
	public String input() throws Exception {
		
		setPersonBean( editService.getPerson() );
		
		return "input";
	}

	public Person getPersonBean() {
		return personBean;
	}
	

	public void setPersonBean(Person person) {
		
		personBean = person;
		
	}


	public List<String> getSports() {
		return Arrays.asList(sports);
	}
	
	public List<String> getGenders() {
		
		return Arrays.asList(genders);
		
	}
	
public List<State> getStates() {
		
		states = new ArrayList<State>();
		states.add( new State("AZ", "Arizona") );
		states.add( new State("CA", "California") );
		states.add( new State("FL", "Florida") );
		states.add( new State("KS", "Kansas") );
		states.add( new State("NY", "New York") );
		
		return states;
	}



	public String [] getCarModelsAvailable() {
		return carModelsAvailable;
	}
}
