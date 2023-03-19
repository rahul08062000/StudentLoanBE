package com.studentloan.studentloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentloan.studentloan.dto.EmailDetails;
import com.studentloan.studentloan.dto.OtpDto;
import com.studentloan.studentloan.service.EmailService;

	

//Annotation
@RestController
//Class
@CrossOrigin(origins = "http://localhost:4200")
public class EmailController {

 @Autowired private EmailService emailService;

 // Sending a simple Email
 @PostMapping("/sendMail")
 public ResponseEntity<Boolean>
 sendMail(@RequestBody EmailDetails details)
 {
     boolean mailsentflag
         = emailService.sendSimpleMail(details);

     return new ResponseEntity<>(mailsentflag,HttpStatus.OK);
 }
 
 @PostMapping("/validate-otp")
 public ResponseEntity<Boolean>
 sendMail(@RequestBody OtpDto otpdto)
 {
     boolean mailsentflag
         = emailService.vaildateOtp(otpdto);

     return new ResponseEntity<>(mailsentflag,HttpStatus.OK);
 }
 



}