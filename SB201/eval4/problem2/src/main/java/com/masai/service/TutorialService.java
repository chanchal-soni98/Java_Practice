package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.Repo.TutorialRepository;
import com.masai.model.Totorials;

@Service
public class TutorialService {

	 @Autowired
	    private TutorialRepository tr;

	    public ResponseEntity<Totorials> createTutorial(Totorials tutorial) {
	        if(tutorial.getTitle() == null || tutorial.getDescrition() == null) {
	        	
	        	
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        if(tutorial.getTitle().length() > 50 || tutorial.getDescrition().length() < 200) {
	        	
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        Totorials tute = tr.save(tutorial);
	        return ResponseEntity.status(HttpStatus.CREATED).body(tute);
	    }
}
