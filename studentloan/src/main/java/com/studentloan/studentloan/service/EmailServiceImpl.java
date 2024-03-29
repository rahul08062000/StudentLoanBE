package com.studentloan.studentloan.service;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.studentloan.studentloan.dto.EmailDetails;
import com.studentloan.studentloan.dto.OtpDto;



//Annotation
@Service
//Class
//Implementing EmailService interface
public class EmailServiceImpl implements EmailService {

 @Autowired private JavaMailSender javaMailSender;

 @Value("${spring.mail.username}") private String sender;
 @Value("${spring.mail.password}") private String pass;

 // Method 1
 // To send a simple email
 public boolean sendSimpleMail(EmailDetails details)
 {

     // Try block to check for exceptions
     try {
System.out.println("this is mail password:"+pass);
    	 
         // Creating a simple mail message
         SimpleMailMessage mailMessage
             = new SimpleMailMessage();

         // Setting up necessary details
         int randomnumber = new Random().nextInt(900000) + 100000;
         mailMessage.setFrom(sender);
         mailMessage.setTo(details.getEmailaddress());
         mailMessage.setText("This is your otp " +String.format("%06d", randomnumber)+ " for Studentloan.\nPlease do not share with others");
         mailMessage.setSubject("Test Message ");

         // Sending the mail
         javaMailSender.send(mailMessage);
         return true;
     }

     // Catch block to handle the exceptions
     catch (Exception e) {
         return false;
     }
 }

 public boolean vaildateOtp(OtpDto otpdto) {
	 
	 System.out.println("email: "+otpdto.getEmailaddress()+ " otp: "+otpdto.getOtp());
	 
	 return true;
 }
 
}
