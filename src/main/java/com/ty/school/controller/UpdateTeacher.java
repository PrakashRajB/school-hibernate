package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Teacher;

public class UpdateTeacher {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		Teacher teacher = entityManager.find(Teacher.class, 1);

		if (teacher != null) {
			teacher.setName("John Mathew");
			entityManager.merge(teacher);

		} else {
			System.out.println("Id does not exist");
		}
		transaction.commit();
	}

}
