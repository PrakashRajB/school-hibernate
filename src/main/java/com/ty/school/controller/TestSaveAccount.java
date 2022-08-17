package com.ty.school.controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.BankAccount;

public class TestSaveAccount {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		BankAccount account = new BankAccount();
		account.setName("Nishanth");
		account.setAddress("Mumbai");
		//account.setCreationDateTime(LocalDateTime.now());

		transaction.begin();

		entityManager.persist(account);

		transaction.commit();
	}

}
