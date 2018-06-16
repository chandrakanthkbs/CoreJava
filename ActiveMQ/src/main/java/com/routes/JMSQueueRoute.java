package com.routes;/*package com.activemq.routes;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// End point to Endpoint routing. 
@Component
public class JMSQueueRoute extends RouteBuilder{

	static final Logger log = LoggerFactory.getLogger(JMSQueueRoute.class);
	
	@Autowired
    private ProducerTemplate producerTemplate;
	
	@Override
	public void configure() throws Exception {
		from("{{firstQueue.endpoint}}")
		.transacted()
		.log(LoggingLevel.INFO, log, "Received message")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				String message = UUID.randomUUID().toString();
	            log.info("**********************************");
	            log.info("Send message '{}' to queue....", message);
			}
		})
		.loop()
		.simple("{{outbound.loop.count}}")
		.to("{{secondQueue.endpoint}}")
		.log(LoggingLevel.INFO, log, "Message Sent. Iteration: ${property.camelLoopIndex}")
		.end();
	}

}
*/