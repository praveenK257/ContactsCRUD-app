package com.pk.simpleCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.simpleCRUD.domain.CrudItem;

@Repository
public interface CrudRepo extends JpaRepository<CrudItem,Long>{
	
}
