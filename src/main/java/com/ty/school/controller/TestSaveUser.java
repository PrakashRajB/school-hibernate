package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;
import com.ty.school.helper.AES;

public class TestSaveUser {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Prasanth");
		user.setEmail("prasanth@gmail.com");
		user.setPhone(9087102066l);
		user.setPassword(AES.encrypt("prasanth1234"));

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = managerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(user);
		
		entityTransaction.commit();	
	}
}
