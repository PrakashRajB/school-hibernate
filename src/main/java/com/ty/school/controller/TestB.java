package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Teacher;

public class TestB {
	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setId(2);
		teacher.setName("RubyMartha");
		teacher.setEmail("rubyma12@gmail.com");
		teacher.setPhone(9080919287l);

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		
		entityManager.persist(teacher);

		transaction.commit();
	}

}
