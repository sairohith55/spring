package com.beans;

public class GreetingMessage {

	private String message;
	
	public GreetingMessage(){
		
		System.out.println("Greeting msg object is injected");
	}

public GreetingMessage(String msg){
		
		message=msg;
	}
@Override
public String toString() {
	return "message is :"+message;
}
}
