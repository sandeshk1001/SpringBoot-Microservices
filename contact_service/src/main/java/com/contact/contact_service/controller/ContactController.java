package com.contact.contact_service.controller;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // url for testing
    //localhost:9002/contact/user/1311
    @GetMapping("/user/{userID}")
    public List<Contact> getContactList(@PathVariable("userID") Long id){
        return contactService.getContactList(id);
    }

}
