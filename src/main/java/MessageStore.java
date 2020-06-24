package main.java;

public class MessageStore {
	public String message;
	
	public MessageStore() {
		message = "Hello Struts User";
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return message + " (from toString)";
	}
}
