package nkhatun.demo.com.Kafka.controller;

import nkhatun.demo.com.Kafka.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private MessageProducer producer;

    @PostMapping(value = "/publish")
    public void sendMessage(@RequestParam("message") String message){
        producer.publishToKafka(message);
    }

}
