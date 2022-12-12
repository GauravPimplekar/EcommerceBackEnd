package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Model.FeedBacks;
import com.user.Repo.FeedbackRepo;


@Service
public class FeedBackServiceImpl implements FeedBackService {
	
	@Autowired
	FeedbackRepo fRepo;

	@Override
	public FeedBacks giveFeedBack(FeedBacks feedback) {
		// TODO Auto-generated method stub
		return fRepo.save(feedback);
	}

}
