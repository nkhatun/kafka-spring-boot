package nkhatun.demo.com.Kafka.consumer;

import nkhatun.demo.com.Kafka.producer.MessageProducer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MessageConsumer {
    public static final Logger log = Logger.getLogger(MessageProducer.class.getName());

    @KafkaListener(topics = "kafkaTopic",groupId = "kafkaGroup")
    public void consumeTopics(String message){
        log.info("Consumed Message is:: "+message);
    }
}
