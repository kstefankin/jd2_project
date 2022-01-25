package by.academy.box.service;


import by.academy.box.dao.MessageRepository;
import by.academy.box.pojos.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;


    public Message saveMessage(Message message){

        return messageRepository.save(message);
    }

    public List<Message> findAll(){

        return messageRepository.findAll();
    }



    public List<Message> findBySurnameTo(String surname) {

        List<Message> messages = messageRepository.findBySurnameTo(surname);
        return messages;
    }
}



