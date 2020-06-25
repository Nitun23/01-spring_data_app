package com.example.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACTS_MASTER_SEQ")
public class ContactsMasterEntity {
	
	@Id
	@GenericGenerator(name="CONTACT_ID_GEN", strategy = "com.example.app.generator.ContactIdGnerator")
	@GeneratedValue(generator="CONTACT_ID_GEN")
	@Column(name="CONTACT_ID")
	private String contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	

}
