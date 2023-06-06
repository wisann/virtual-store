package com.dev.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;



@Service
public class EmailService {

    @Value("${spring.mail.username}")
    private String sender;

    @Autowired
    private JavaMailSender JavaMailSender;

    public String sendEmail(String recipient, String title, String message){
        try{ SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(sender);
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setText(message);
        JavaMailSender.send(simpleMailMessage);
    return "Email sent";
    }
        catch (Exception erro){
            return "Error trying to send email";

        }


    }
    
     

   

    
    
}
