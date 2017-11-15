package com.example.mailproject;

import com.example.mailproject.entity.User;
import com.example.mailproject.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private UserRepository repository;
    private NotificationService notificationService;

    @Autowired
    public RegistrationController(UserRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    @RequestMapping("/signup")
    public String signup() {
        return "Please sign up to our service.";
    }

    @RequestMapping("/signup-success")
    public String signupSuccess(){
        //create user
        User user = repository.findByUsernameIgnoreCase("jack");

        //send notification to user
        notificationService.sendNotification(user);

        return "Thank you for registration with us.";
    }
}
