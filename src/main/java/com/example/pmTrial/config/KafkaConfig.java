//package com.example.pmTrial.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//
////@Configuration
//public class KafkaConfig {
//    @Bean
//    ConcurrentKafkaListenerContainerFactory<Integer, String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<Integer, String> factory = ...
//        ...
//        factory.getContainerProperties().setAckOnError(false);
//        factory.getContainerProperties().setErrorHandler(dlqErrorHandler);
//        return factory;
//    }
//}
