package main.service;

import main.java.Person;

public interface EditService {
	Person getPerson();
	void savePerson(Person personBean);
}
