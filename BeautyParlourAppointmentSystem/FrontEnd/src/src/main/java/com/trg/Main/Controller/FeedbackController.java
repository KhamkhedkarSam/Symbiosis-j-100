package com.trg.Main.Controller;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.trg.Main.Model.Client;
import com.trg.Main.Model.Feedback;
import com.trg.Main.repository.FeedbackRepository;


	@RestController
	@RequestMapping("/feedback")
	public class FeedbackController {
		@Autowired
	  private FeedbackRepository feedbackrepository;

	  //build create client REST API
	  @PostMapping("/CreateFeedback")
	  public ResponseEntity<Feedback> saveClient(@RequestBody Feedback feedback){
		  return new ResponseEntity<Feedback>(feedbackrepository.save(feedback),HttpStatus.CREATED);
		  
	  }
	  @DeleteMapping("/DeleteClient/{id}")
	    public ResponseEntity<Client> deleteClient( @PathVariable int id){
	    	  if (feedbackrepository.existsById(id)) { 
	    	        feedbackrepository.deleteById(id); 
	    	        return ResponseEntity.noContent().build(); 
	    	    }
	    	    return ResponseEntity.notFound().build();
	    }
	} 



