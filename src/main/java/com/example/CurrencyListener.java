package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fnz.debezium.schema.CurrencyKey;
import com.fnz.debezium.schema.CurrencyValue;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST) 
public class CurrencyListener {
	private static Logger log = LoggerFactory.getLogger(CurrencyListener.class);


    @Topic("${kafka.topic.Currency}") 
    public void receive(@KafkaKey CurrencyKey key, CurrencyValue currency) { 
    	log.info("Got Currency - " + currency.getCURRENCYCODE() + ":" + currency.getCURRENCYDESCRIPTION());
    }
}