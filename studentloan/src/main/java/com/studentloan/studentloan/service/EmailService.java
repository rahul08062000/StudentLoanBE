package com.studentloan.studentloan.service;

import com.studentloan.studentloan.dto.EmailDetails;

//Java Program to Illustrate Creation Of
//Service Interface


//Importing required classes

//Interface
public interface EmailService {

 // Method
 // To send a simple email
 boolean sendSimpleMail(EmailDetails details);

 
}
