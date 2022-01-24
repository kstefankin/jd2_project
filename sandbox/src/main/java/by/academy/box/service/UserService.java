package by.academy.box.service;


import by.academy.box.dao.UserRepository;
import by.academy.box.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){

        return userRepository.save(user);
    }

    public User getUser(String login){

        return userRepository.getByLogin(login);
    }



    public List<User> findAll(){
        return userRepository.findAll();
    }


}
