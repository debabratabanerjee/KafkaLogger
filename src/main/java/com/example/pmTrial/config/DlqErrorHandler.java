//package com.example.pmTrial.config;
//
//import java.util.List;
//
//import org.apache.kafka.clients.consumer.Consumer;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.listener.ContainerAwareErrorHandler;
//import org.springframework.kafka.listener.MessageListenerContainer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DlqErrorHandler implements ContainerAwareErrorHandler {
//    
//    public void handle(Exception thrownException, list<ConsumerRecord<?, ?> records, Consumer<?, ?> consumer, MessageListenerContainer container) {
//        Consumerrecord<?, ? record = records.get(0);
//        try {
//           
//        } catch (Exception e) {
//            
//        }
//    }
//
//
//    @Override
//    public void handle(Exception thrownException, List<ConsumerRecord<?, ?>> records, Consumer<?, ?> consumer,
//            MessageListenerContainer container) {
//        // TODO Auto-generated method stub
//        
//    }}
