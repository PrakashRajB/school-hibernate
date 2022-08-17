package com.ty.school.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.school.dto.User;
import com.ty.school.helper.AES;

public class GetAllUsers {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		String jpql = "SELECT u FROM User u";

		Query query = entityManager.createQuery(jpql);

		List<User> users = query.getResultList();

		for (User u : users) {
			System.out.println("Id is " + u.getId());
			System.out.println("Name is " + u.getName());
			System.out.println("Email is " + u.getEmail());
			System.out.println("Phone is " + u.getPhone());
			System.out.println("Password is " + AES.decrypt(u.getPassword()));
			System.out.println("------------------------------------------------");
		}
	}

}
