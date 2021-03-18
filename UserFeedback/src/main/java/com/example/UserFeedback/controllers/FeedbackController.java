package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/feedback")
	public @ResponseBody Iterable<Feedback> getAllFeedbacks() {
        return feedbackService.GetAllFeedback();
    }
	
	@PostMapping("/feedback")
	public Feedback addNewFeedback(Feedback newFeedback, @RequestParam(name="user") String user, @RequestParam(name="comment") String comment, @RequestParam(name="rating") String rating) {
		Feedback feedback = new Feedback();
		
		if(!rating.isBlank()){
			if(user.isBlank())
				feedback.setUser(null);
			else
				feedback.setUser(user);
			if(comment.isBlank())
				feedback.setComments(null);
			else
				feedback.setComments(comment);
			feedback.setRating(Integer.parseInt(rating));
	
			feedbackService.saveFeedback(feedback);
		}
		
		return feedback;  
	}
}
