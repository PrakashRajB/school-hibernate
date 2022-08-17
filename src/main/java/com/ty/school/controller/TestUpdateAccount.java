package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.BankAccount;

public class TestUpdateAccount {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		BankAccount account = entityManager.find(BankAccount.class, 2);

		if (account != null) {
			transaction.begin();
			account.setName("Navin Armstrong");
			entityManager.merge(account);
			transaction.commit();

		} else {
			System.out.println("No account is found");
		}
	}

}
