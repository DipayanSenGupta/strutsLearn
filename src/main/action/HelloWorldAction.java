package main.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.MessageStore;

public class HelloWorldAction extends ActionSupport {

	private MessageStore messageStore;
	
	public String execute() {
		messageStore = new MessageStore();
		return "success";
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
}
