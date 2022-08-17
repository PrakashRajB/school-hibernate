package com.ty.school.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.school.dto.User;
import com.ty.school.helper.AES;

public class GetUsersPositionParameter {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";

		Query query = entityManager.createQuery(jpql);

		query.setParameter(1, "gokuL@gmail.com");
		query.setParameter(2, AES.encrypt("gokul1234"));

		List<User> users = query.getResultList();

		for (User u : users) {
            System.out.println("Id is "+u.getId());
            System.out.println("Name is "+u.getName());
            System.out.println("email is "+u.getEmail());
            System.out.println("password is "+AES.decrypt(u.getPassword()));
            System.out.println("Phone is "+u.getPhone());
            System.out.println("--------------------------------------------------");
					
		}

	}

}
