package by.academy.box.controller;



import by.academy.box.pojos.Message;
import by.academy.box.pojos.User;
import by.academy.box.service.MessageService;
import by.academy.box.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class NetController {



    @Autowired
    private UserService userService;

    @Autowired
    private MessageService messageService;


    @GetMapping("/")
    public String sayHello() {
        return "startpage";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationpage";
    }

    @GetMapping("/enter")
    public String enterForm(Model model) {
        model.addAttribute("user", new User());
        return "userenterpage";
    }


    @PostMapping("/addNewMan")
    public String addNewMan(@ModelAttribute("user") User user) {

        userService.saveUser(user);

        return "successpage";
    }

    @PostMapping("/home")
    public String showHomePage (@ModelAttribute("user") User user, Model model) {

        String login=user.getLogin();


        model.addAttribute("user" ,userService.getUser(login));

        return "homepage";
    }


    @GetMapping("/exit")
    public String sayGoodbye() {
        return "startpage";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";

    }

    @GetMapping("/write")
    public String messageForm (Model model) {
        model.addAttribute("message", new Message());
        return "writemessage";
    }

    @PostMapping("/newMessage")
    public String newMessage (@ModelAttribute("message") Message message) {

        message.setSurnameFrom("test");
        message.setSurnameTo("ttttttrrrrr");
        messageService.saveMessage(message);

        return "startpage";
    }



}
