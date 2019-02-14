package org.sduwh.vcode.remote.judger.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Component
@EnableScheduling
public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafka;

    @Scheduled(cron = "00/1 * * * * ?")
    public void send() {
        String message = UUID.randomUUID().toString();
        ListenableFuture<SendResult<String, String>> future = kafka.send("topic1", message);
        future.addCallback(o -> {
            System.out.println("消息发送成功: " + message);
        }, t -> {
            System.out.println("消息发送失败: " + message);
        });
    }
}
