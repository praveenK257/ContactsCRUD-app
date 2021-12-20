package com.pk.simpleCRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.simpleCRUD.domain.CrudItem;
import com.pk.simpleCRUD.repositories.CrudRepo;

@Service
public class CrudService {

	@Autowired
	private CrudRepo repo;
	
	public List<CrudItem> getAllItems(){
		return repo.findAll();
	}
	
	public CrudItem getContact(Long id){
		return repo.getById(id);
	}
	
	public void saveContact(CrudItem crudItem) {
		repo.save(crudItem);
	}
	
	public void deleteContact(Long id) {
		repo.delete(getContact(id));
	}

}
