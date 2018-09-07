package com.michael.quotetask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.michael.quotetask.model.Quote;
import com.michael.quotetask.persistense.QuoteRepository;

@Service
public class QuoteService {
	
	@Autowired
	QuoteRepository QuoteRepo;
	
	public List<Quote> findAll() {
		return QuoteRepo.findAll();
	}
	
	public Quote save(Quote q) {
		//Assert.notNull(q, "Quote cannot be null");
		//Assert.notNull(q.getText(), "Quote content cannot be null");
		return QuoteRepo.saveAndFlush(q);
		
	}
	
	public void deleteById(Long id) {
		 QuoteRepo.deleteById(id);
	}
	
	
}
