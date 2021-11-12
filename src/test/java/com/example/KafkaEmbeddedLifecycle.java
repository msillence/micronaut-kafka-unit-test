//package com.example;
//
//import java.util.Map;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.TestInstance;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import io.micronaut.core.annotation.NonNull;
//import io.micronaut.core.util.CollectionUtils;
//import io.micronaut.test.context.TestContext;
//import io.micronaut.test.context.TestExecutionListener;
//import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
//
//@MicronautTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class KafkaEmbeddedLifecycle implements TestExecutionListener {
//	private static final Logger log = LoggerFactory.getLogger(KafkaEmbeddedLifecycle.class);
//	
//	public KafkaEmbeddedLifecycle() {
//		System.out.println("=========== created ======================");
//		start();
//	}
//	
//	@BeforeAll
//    public void start() {
//    	System.out.println("=========== starting kafka ======================");
//		log.info("========== starting kafka =================");
////    	try (KafkaContainer container = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka"))) {
////            container.start();
////            Map<String, Object> config = Collections.singletonMap( 
////            		ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
////               container.getBootstrapServers()
////            );
////        }
//    }
//
//	@Override
//	public void beforeTestClass(TestContext testContext) throws Exception {
//    	System.out.println("=========== starting kafka ======================");
//		log.info("========== starting kafka =================");
//	}
//	
//	
//
//}
