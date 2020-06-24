package main.java;

public class MessageStore {
	public String message;
	
	public MessageStore() {
		message = "Hello Struts User";
	}
	
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return message + " (from toString)";
	}
}
