package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="message")
public class Message {

	@Id
	@GeneratedValue
	private int id;
	
	 private String message;
	 
	 public Message() {}
	 
	 public Message(String message) {
		 this.message = message;
	 }
	 
	 public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
}
