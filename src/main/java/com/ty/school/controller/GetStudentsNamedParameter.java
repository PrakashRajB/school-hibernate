package com.ty.school.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.school.dto.Student;

public class GetStudentsNamedParameter {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		
		String jpql="SELECT s FROM Student s WHERE s.age > :myage";
		
		Query query=entityManager.createQuery(jpql);
		
		query.setParameter("myage",25);
		
		List<Student> list = query.getResultList();

		for (Student s : list) {
			System.out.println("Id is " + s.getId());
			System.out.println("Name is " + s.getName());
			System.out.println("Age is " + s.getAge());
			System.out.println("-----------------------------------");

		}

	}

}
