package main.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.MessageStore;

public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4089330616328359512L;
	private MessageStore messageStore;
	private static int helloCount = 0;
	public String userName = "vongChong";
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;						
	}

	public String execute() {
		
		messageStore = new MessageStore();

		messageStore.setMessage(messageStore.getMessage()+ " "+ userName);			

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
