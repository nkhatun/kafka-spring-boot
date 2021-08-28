package nkhatun.demo.com.Kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MessageProducer {

    public static final Logger log = Logger.getLogger(MessageProducer.class.getName());
    public static final String TOPIC = "kafkaTopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public  void publishToKafka(String message){
        log.info("Publishing to topic:: "+message);
        this.kafkaTemplate.send(TOPIC,message);
    }


}
