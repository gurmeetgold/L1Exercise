package com.dev.l1exercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String messageValue;

    public Message() {
    }

    public Message(String messageValue) {
        this.messageValue = messageValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageValue='" + messageValue + '\'' +
                '}';
    }

}
