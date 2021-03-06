package com.flashcards.flashcard;

import com.flashcards.flashcard.Model.FlashCard;
import com.flashcards.flashcard.Model.User;
import com.flashcards.flashcard.Repository.FlashCardRepository;
import com.flashcards.flashcard.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class LoadDatabase implements CommandLineRunner {

	
	private final FlashCardRepository flashcardRepository;
	private final UserRepository userRepository;

	@Autowired
	public LoadDatabase(FlashCardRepository flashcardRepository, UserRepository userRepository) {
		this.flashcardRepository = flashcardRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
 
        this.flashcardRepository.save(new FlashCard("What is JPA?"));
        
		this.flashcardRepository.save(new FlashCard("What is Spring Boot?", "A framework that allows writing web apps"));
		
		this.userRepository.save(new User("ericgumba@gmail.com", "password")); 
		 
		log.info("---------------------USER REPOSITORY FIND BY EMAIL -----------------------------");
		 log.info(userRepository.findByEmail("ericgumba@gmail.com").getEmail());
        
	}
}