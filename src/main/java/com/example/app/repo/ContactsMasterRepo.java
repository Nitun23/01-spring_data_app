package com.example.app.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.app.entity.ContactsMasterEntity;

public interface ContactsMasterRepo extends JpaRepository<ContactsMasterEntity, Serializable> {
	
	/*
	 * public ContactsMasterEntity findByContactName(String contactName);
	 * 
	 * public ContactsMasterEntity findByContactNameAndContactNumber(String
	 * contactName,Long contactNumber);
	 */
}
