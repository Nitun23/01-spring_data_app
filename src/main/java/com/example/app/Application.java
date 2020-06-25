package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.app.entity.ContactsMasterEntity;
import com.example.app.repo.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		ContactsMasterRepo repo=ctxt.getBean(ContactsMasterRepo.class);
		ContactsMasterEntity entity=new ContactsMasterEntity();
		
		//ContactsMasterEntity entity=repo.findByContactNameAndContactNumber("chandra", 2344568756l);
		//ContactsMasterEntity entity=repo.findByContactName("nitu");
		
		//entity.setContactId(102); 
		entity.setContactName("chandu");
		 entity.setContactNumber(2576456878l);
		 ContactsMasterEntity saveEntity= repo.save(entity); 
		System.out.println(saveEntity);
		
		
	//	System.out.println("name===>"+repo.getClass().getName());
		/*
		 * ContactsMasterEntity entity=new ContactsMasterEntity();
		 * entity.setContactId(102); entity.setContactName("chandra");
		 * entity.setContactNumber(2344568756l); repo.save(entity); 
		 * ctxt.close();
		 */
		 ctxt.close();
	}

}