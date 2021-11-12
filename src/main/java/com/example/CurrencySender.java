package com.example;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.concurrent.Future;

import javax.inject.Singleton;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.errors.ProducerFencedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fnz.debezium.schema.CurrencyKey;
import com.fnz.debezium.schema.CurrencyValue;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.context.annotation.Value;

@Singleton
public class CurrencySender {
	private static Logger log = LoggerFactory.getLogger(CurrencySender.class);

	@Value("${kafka.topic.Currency}")
	public String topic;

	private final Producer<CurrencyKey, CurrencyValue> currencyProducer;

	public CurrencySender(@KafkaClient(id="currency") Producer<CurrencyKey, CurrencyValue> kafkaProducer) {
		this.currencyProducer = kafkaProducer;
		currencyProducer.initTransactions();
	}

	// synchronous sending messages
	public synchronized Future<RecordMetadata> send(String currencyId, String description, BigDecimal rate) {
		CurrencyKey key = CurrencyKey.newBuilder().setCURRENCYCODE(currencyId).build();
		CurrencyValue value = CurrencyValue.newBuilder().setCURRENCYCODE(currencyId).setCURRENCYDESCRIPTION(description).setEXCHANGERATE(rate).build();
		ProducerRecord<CurrencyKey, CurrencyValue> record = new ProducerRecord<>(topic, key, value);
		try {
			currencyProducer.beginTransaction();
			Future<RecordMetadata> sent = currencyProducer.send(record);
			currencyProducer.commitTransaction();
			return sent;
		} catch (ProducerFencedException e) {
			log.error("failed to send message", e);
			currencyProducer.abortTransaction();
			throw e;
		}
	}

}
