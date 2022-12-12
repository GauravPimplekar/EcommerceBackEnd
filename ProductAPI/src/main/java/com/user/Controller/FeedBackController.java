package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.FeedBacks;
import com.user.Service.FeedBackService;

@RestController
public class FeedBackController {

	@Autowired
	FeedBackService fService;
	
	@PostMapping("/FeedBack")
	public FeedBacks getFeedBack(@RequestBody FeedBacks feedback) {
		
		return fService.giveFeedBack(feedback);
	}
}
