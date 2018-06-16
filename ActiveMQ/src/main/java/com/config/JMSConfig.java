package com.config;/*package com.activemq.config;

import java.io.File;

import javax.jms.ConnectionFactory;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.activemq.store.kahadb.KahaDBPersistenceAdapter;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration
public class JMSConfig {
	
	//Use when routing. Option 1
	@Bean
	public JmsTransactionManager getJMSTransactionManager(final ConnectionFactory connectionFactory){
		JmsTransactionManager jmsTransactionManager = new JmsTransactionManager();
		jmsTransactionManager.setConnectionFactory(connectionFactory);
		return jmsTransactionManager;
	}
	
	@Bean
	public JmsComponent getJMSTransactionManager(final ConnectionFactory connectionFactory, final JmsTransactionManager jmsTransactionManager,
			@Value("${max.concurrent.consumers}") final int maxConcurrentConsumers){
		JmsComponent jmsComponent = new JmsComponent();
		jmsComponent.jmsComponentTransacted(connectionFactory, jmsTransactionManager);
		jmsComponent.setMaxConcurrentConsumers(maxConcurrentConsumers);
		return jmsComponent;
	}
	
	
	@Bean
	public ActiveMQConnectionFactory queueFactory(ConnectionFactory connectionFactory){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		//configurer.configure(factory, connectionFactory);
		//factory.setPubSubDomain(false);
		return factory;
	}
	
	@Bean
	public JmsListenerContainerFactory<?> queueReceiverFactory(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		configurer.configure(factory, connectionFactory);
		factory.setPubSubDomain(false);
		return factory;
	}
	
	
	@Bean
	public JmsListenerContainerFactory<?> topicReceiverFactory(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		configurer.configure(factory, connectionFactory);
		factory.setPubSubDomain(true);
		return factory;
	}
	
	@Bean
	public JmsListenerContainerFactory<?> queueFactory(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		configurer.configure(factory, connectionFactory);
		factory.setPubSubDomain(false);
		return factory;
	}
	
	@Bean
	public BrokerService createPersistenceAdapter() throws Exception { 
		BrokerService broker = new BrokerService(); 
        File dataFileDir = new File("D:\test1"); 
        KahaDBPersistenceAdapter kahaDBPersistenceAdapter = new KahaDBPersistenceAdapter();
        kahaDBPersistenceAdapter.setDirectory(dataFileDir); 
 
        // Using a bigger journal file 
        kahaDBPersistenceAdapter.setJournalMaxFileLength(1024*1204*100); 
         
        // small batch means more frequent and smaller writes 
        kahaDBPersistenceAdapter.setIndexWriteBatchSize(100); 
        // do the index write in a separate thread 
        kahaDBPersistenceAdapter.setEnableIndexWriteAsync(true); 
         
        broker.setPersistenceAdapter(kahaDBPersistenceAdapter); 
        //create a transport connector 
        broker.addConnector("tcp://localhost:61616"); 
        //start the broker 
        broker.start();
        return broker;
	}
}
*/