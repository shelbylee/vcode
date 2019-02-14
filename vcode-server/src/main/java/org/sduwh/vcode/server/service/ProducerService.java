package org.sduwh.vcode.server.service;

import org.sduwh.vcode.server.domain.JudgeRequest;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void produce(JudgeRequest request) {
        amqpTemplate.convertAndSend("ttt", "123");
    }
}
