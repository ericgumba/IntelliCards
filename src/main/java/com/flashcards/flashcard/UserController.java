package com.flashcards.flashcard;
 
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController 
class UserController {   
 
    // @Autowired
    // UserService userService;

    @CrossOrigin(origins = "http://localhost:3000") 
    @GetMapping(value = "/login")
    String login() { 
      return "hello world"; 
    }
    @CrossOrigin(origins = "http://localhost:3000") 
    @GetMapping(value = "/register")
    String register() { 
      return "hello world"; 
    }
      

}