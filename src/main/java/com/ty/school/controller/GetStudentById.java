package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class GetStudentById {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 2);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("Id does not exit");
		}
	}

}
