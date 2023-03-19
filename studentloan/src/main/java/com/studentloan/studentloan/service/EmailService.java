package com.studentloan.studentloan.service;

import com.studentloan.studentloan.dto.EmailDetails;
import com.studentloan.studentloan.dto.OtpDto;

//Java Program to Illustrate Creation Of
//Service Interface


//Importing required classes

//Interface
public interface EmailService {

 // Method
 // To send a simple email
 boolean sendSimpleMail(EmailDetails details);

boolean vaildateOtp(OtpDto otpdto);

 
}
