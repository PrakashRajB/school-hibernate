package com.ty.school.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.school.dto.Student;

public class GetAllStudents {
	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = managerFactory.createEntityManager();

		String jpql = "SELECT s FROM Student s";

		Query query = entityManager.createQuery(jpql);

		List<Student> list = query.getResultList();

		for (Student s : list) {
			System.out.println("Id is " + s.getId());
			System.out.println("Name is " + s.getName());
			System.out.println("Age is " + s.getAge());
			System.out.println("-----------------------------------");
		}
	}

}
