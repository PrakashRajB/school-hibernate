package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.school.dto.Teacher;

public class GetTeacherById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 2);

		if (teacher != null) {
			System.out.println(teacher);
		} else {
			System.out.println("Id does not exist");
		}

	}

}
