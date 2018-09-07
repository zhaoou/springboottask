package com.michael.quotetask.persistense;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.quotetask.model.Quote;


public interface QuoteRepository extends JpaRepository<Quote, Long>  {

}
