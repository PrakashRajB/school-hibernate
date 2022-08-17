package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class TestA {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(2);
		student.setName("Arun");
		student.setAge(28);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();

		System.out.println("----Data Inserted----");
	}

}
