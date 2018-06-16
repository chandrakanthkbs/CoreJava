package com.routes;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.activemq.bo.Person;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class QueueReceiver {

	static int count= 0 ;
	
	@JmsListener(destination = "Queue1")
	public void receiveMess(String mess) throws Exception{
		count++;
		System.err.println("Message received : " + mess);
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(mess, Person.class);
		System.out.println("Count = " + count + ":: Queue message converted to Person Object = " + person.toString());
		throw new Exception("");
	}
}
