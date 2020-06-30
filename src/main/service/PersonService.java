package main.service;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.WildPerson;

public class PersonService {
	private static final Logger log = LogManager.getLogger(PersonService.class);

	private static SortedMap<Integer, WildPerson> wildPeople = new TreeMap<>();
	static {
		wildPeople.put(0, new WildPerson(0,"Steve","Smith"));
		wildPeople.put(1, new WildPerson(0,"Sue","Jones"));	
	}
	
private static List<WildPerson> wildPersonList = new ArrayList<>();
	static {
		for (Integer id : wildPeople.keySet()) {
			wildPersonList.add(wildPeople.get(id));
		}
	}
	
	public static List <WildPerson> getPersons(){
		return wildPersonList;
	}
	
	private int getNewId() {
		int newId = 0;
		try {
			newId = wildPeople.lastKey() + 1 ;
		} catch (NoSuchElementException ex) {
			log.info("I'd value set to 0");
		}
		return newId;
	}
	
	public void save(WildPerson person) {
		int newId = getNewId();
		person.setId(newId);
		wildPeople.put(newId, person);
		rebuildPersonList();
		
	}
	
	public static void rebuildPersonList() {
		wildPersonList = new ArrayList<>();
		
		for(Integer id : wildPeople.keySet()) {
			wildPersonList.add(wildPeople.get(id));
		}
	}
	
	public void update(WildPerson wildPerson) {
		WildPerson tempPerson = wildPeople.get(wildPerson.getId());
		tempPerson.setFirstName(wildPerson.getFirstName());
		tempPerson.setLastName(wildPerson.getLastName());
		
		rebuildPersonList();
	}
	
	public void deletePerson(int id) {
		wildPeople.remove(id);
	}
	
	public WildPerson getPerson(int id) {
		return wildPeople.get(id);
	}
	
}
