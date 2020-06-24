package main.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.MessageStore;

public class HelloWorldAction extends ActionSupport {

	private MessageStore messageStore;
	private static int helloCount = 0;
	
	public String execute() {
		messageStore = new MessageStore();
		helloCount++;
		return "success";
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public int getHelloCount() {
		return helloCount;
	}
}
