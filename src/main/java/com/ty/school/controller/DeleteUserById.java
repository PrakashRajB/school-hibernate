package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class DeleteUserById {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		User user = entityManager.find(User.class,7);

		if (user != null) {
            entityManager.remove(user);
		} else {
             System.out.println("No User found");
		}

		entityTransaction.commit();
	}

}
