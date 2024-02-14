package com.jeanpires.strconsumer.listeners;

import com.jeanpires.strconsumer.custom.StrConsumerCustonListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StrConsumerListener {

    @SneakyThrows
    @StrConsumerCustonListener(groupId = "group-1")
    public void create(String message){
        log.info("CREATE ::: Recive message {}", message);
        throw new IllegalArgumentException("EXCEPTION...");
    }

    @StrConsumerCustonListener(groupId = "group-1")
    public void log(String message){
        log.info("LOG ::: Recive message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void history(String message){
        log.info("HISTORY ::: Recive message {}", message);
    }

}
