package by.academy.box.service;


import by.academy.box.dao.MessageRepository;
import by.academy.box.pojos.Message;
import by.academy.box.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message){

        return messageRepository.save(message);
    }



}
