package com.example.mailproject;

import com.example.mailproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(User user) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getEmail());
        mail.setFrom("shiny717@yandex.ru");
        mail.setSubject("Java MailSender: Registration successful");
        mail.setText("Thank you, " + user.getUsername() + ", for registration");

        javaMailSender.send(mail);
    }
}
