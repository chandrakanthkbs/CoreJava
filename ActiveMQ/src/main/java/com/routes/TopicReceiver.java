package com.routes;/*package com.activemq.routes;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.activemq.bo.Person;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class TopicReceiver {

	@JmsListener(destination = "Topic1", containerFactory = "topicReceiverFactory")
	public void receiveMess(String mess) throws Exception{
		
		System.err.println("Message received : " + mess);
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(mess, Person.class);
		System.out.println("Converted to Person Object = " + person.toString());
		//throw new Exception("");
	}
}
*/