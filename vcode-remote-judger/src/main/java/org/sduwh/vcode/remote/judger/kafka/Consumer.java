package org.sduwh.vcode.remote.judger.kafka;

import org.springframework.kafka.annotation.KafkaListener;

@KafkaListener(topics = {"topic1"})
public class Consumer {

}
