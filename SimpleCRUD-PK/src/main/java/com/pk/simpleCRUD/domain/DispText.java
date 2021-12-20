package com.pk.simpleCRUD.domain;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class DispText {
	
	@Id
	private String text;

	public DispText() {
		this.text = "Update a contact...";
	}

	public DispText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}	
