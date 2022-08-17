package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class DeleteStudent {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, 2);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("Data is Removed");
		} else {
			System.out.println("Student is not present");
		}
	}

}
