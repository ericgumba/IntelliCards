package com.flashcards.flashcard.Repository;

 
import org.springframework.data.jpa.repository.JpaRepository; 

import com.flashcards.flashcard.Model.*;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {

}