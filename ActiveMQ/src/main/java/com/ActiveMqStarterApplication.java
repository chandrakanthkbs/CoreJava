package com;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.apache.activemq.ScheduledMessage;
import org.apache.activemq.broker.BrokerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.annotation.EnableJms;

import com.activemq.bo.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
//@ImportResource("classpath:activeMQ-config.xml")
@EnableJms
public class ActiveMqStarterApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ActiveMqStarterApplication.class, args);
		BrokerService broker = new BrokerService();
		broker.addConnector("tcp://localhost:61617");
		broker.setPersistent(false);
		broker.start();
		//ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		//ActiveMQConnection activeMQConnection = (ActiveMQConnection)activeMQConnectionFactory.createConnection();
		
		/*Session session = activeMQConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("Queue1");
		MessageProducer producer = session.createProducer(destination);
		TextMessage message = session.createTextMessage("test msg");
		long time = 60 * 1000;
		message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, time);
		producer.send(message);*/
	}
	
	private static void createPersistantTopic(Connection tConnection) throws JMSException, JsonProcessingException {
		tConnection.start();
		Session session = tConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createTopic("Topic1");
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.PERSISTENT);
		producer.send(populateMessage(session));
		System.err.println("Message sent to topic ");
		session.close();
		tConnection.close();
	}

	private static void createPersistantQueue(Connection qConnection) throws JMSException, JsonProcessingException {
		qConnection.start();
		Session session = qConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("Queue1");
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.PERSISTENT);
		producer.send(populateMessage(session));
		System.err.println("Message sent to Queue ");
		session.close();
		qConnection.close();
	}

	private static Message populateMessage(Session session) throws JsonProcessingException, JMSException {
		Person person = new Person("Chandra", "510", "999999999");
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
		TextMessage mess = session.createTextMessage(jsonInString);
		return mess;
	}
}
