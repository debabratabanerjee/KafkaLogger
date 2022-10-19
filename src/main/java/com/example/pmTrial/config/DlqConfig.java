package com.example.pmTrial.config;

import org.springframework.kafka.annotation.RetryableTopic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class DlqConfig{
    
    Logger log = LogManager.getLogger(this.getClass());
    
    @RetryableTopic(
        attempts = "2",
        backoff = @Backoff(delay = 1000, multiplier = 2.0),
        autoCreateTopics = "false")
//        topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE)
    @KafkaListener(topics = "orders")
    public void listen(String in, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
      log.info(in + " from " + topic);
    }

    @DltHandler
    public void dlt(String in, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
      log.info(in + " from " + topic);
    }
  }

