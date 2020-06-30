package main.action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import main.java.WildPerson;
import main.service.PersonService;

public class WildPersonAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7018410522446102280L;
	private static final Logger log = LogManager.getLogger(WildPersonAction.class);
	WildPerson wildPerson;
	int id;
	List<WildPerson> wildPersonList = PersonService.getPersons();
	PersonService wildPersonService = new PersonService(); 
	
	public String execute() throws Exception {
		log.debug("In execute method");
		return "success";
	}
	
	public String create() {
		log.debug("In create method");
		wildPerson = new WildPerson();
		return "input";
	}
	
	public String runCreateThis() {
		log.debug("in create method");
		wildPerson = new WildPerson();
		return "input";
	}
	
	public String edit() {
		log.debug("in edit method");
		wildPerson = wildPersonService.getPerson(id);
		return "input";
	}
	
	   public WildPerson getPerson() {
	        return wildPerson;
	    }


	    public void setPerson(WildPerson person) {
	        this.wildPerson = person;
	    }


	    public List<WildPerson> getPersonList() {
	        return wildPersonList;
	    }


	    public void setPersonList(List<WildPerson> personList) {
	        this.wildPersonList = personList;
	    }


	    public int getId() {
	        return id;
	    }


	    public void setId(int id) {
	        this.id = id;
	    }
}
