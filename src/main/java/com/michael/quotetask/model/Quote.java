package com.michael.quotetask.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Quote {
	
	@Id
	@GeneratedValue
	Long id;
	private String text;
	private String author;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	
	public Quote(String text, String author) {
		this.text =text;
		this.author = author;
	}
	public Quote() {}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/*@PrePersist
	public void sedId() {
		id=UUID.randomUUID();
	}*/
	@Override
	public String toString() {
		return "Quote [id=" + id + ", text=" + text + ", author=" + author + "]";
	}
	
	
}
