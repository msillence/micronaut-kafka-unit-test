package com.example;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.context.annotation.Requires;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest//(environments = "kafka") - this doesn't make any difference
@Requires(property = "foo.bar", value = "stuff") // this makes the tests pass
public class CurrencySenderTest {
	private static Logger clog = LoggerFactory.getLogger("container.kafka");
	private static Logger log = LoggerFactory.getLogger(CurrencySenderTest.class);
	
    @Inject
    public CurrencySender bookSender;
	
	@Test
	public void send() {
		log.info("send");
        bookSender.send("GBP", "pounds", BigDecimal.valueOf(1.0));
		log.info("sent");
	}
	
//	@Test
//	public void sendUsingTestContainer() {
//		System.out.println("start test");
//		log.info("testing logging");
//	    try (KafkaContainer container = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka")
//	    		)) {
//			container.withLogConsumer(frame -> {clog.info(frame.getUtf8String());});
//			System.out.println("start kafka");
//	        container.start();
//	        log.info("bootstrap server is: {}", container.getBootstrapServers());
//	        System.out.println("started kakfa");
//	        Map<String, Object> config = Collections.singletonMap( 
//	        		ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
//	           container.getBootstrapServers()
//	        );
//	        
//	        
//	        try (ApplicationContext ctx = ApplicationContext.run(config)) {
//				System.out.println("find sender");
//	        	CurrencySender bookSender = ctx.getBean(CurrencySender.class); 
//	
//				System.out.println("send");
//	            bookSender.send("GBP", "pounds", BigDecimal.valueOf(1.0));
//	        }
//	        container.stop();
//	    }
//	}
}