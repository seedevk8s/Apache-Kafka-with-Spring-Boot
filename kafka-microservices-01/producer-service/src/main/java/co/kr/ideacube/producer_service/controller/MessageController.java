package co.kr.ideacube.producer_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.kr.ideacube.producer_service.producer.MessageProducer;

@RestController
public class MessageController {

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        messageProducer.sendMessage(message);
        return "Message sent: " + message;
    }
}