package com.pk.simpleCRUD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.simpleCRUD.domain.DispText;

@Service
public class DispTextService {
	@Autowired
	private DispText disp;
	
	public DispText getDisp(){
		return disp;
	}
}
