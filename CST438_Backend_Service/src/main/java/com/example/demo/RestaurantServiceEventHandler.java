package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
@RabbitListener(queues = "restaurant-service-q1")
public class RestaurantServiceEventHandler {

	@Autowired
	MessageRepository messageRepo;
	
	private static final Logger log = 
          LoggerFactory.getLogger(RestaurantServiceEventHandler.class);

	@RabbitHandler
	public void receive(String in) {
		System.out.println(in);
		log.info(" [ReservationEventHandler] Received '" + 
                    in + "'");
		
		Message message = new Message(in);
		messageRepo.save(message);
	}
}
