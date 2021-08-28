package nkhatun.demo.com.kafka.listener;

import nkhatun.demo.com.kafka.model.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
@Service
public class KafkaConsumer {
    public static final Logger log = Logger.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "kafka_ex",groupId = "group_id")
    public void consume(String message){
        log.info("Consumed message is:: "+message);
    }

    @KafkaListener(topics = "kafka_ex_json",groupId = "group_json",containerFactory = "kafkaUserListenerFactory")
    public void consumeJson(User user){
        log.info("Consumed json is:: "+user);
    }
}
