package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.FeedBacks;

public interface FeedbackRepo extends JpaRepository<FeedBacks, Integer> {

}
