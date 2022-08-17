package com.ty.school.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.AccountId;
import com.ty.school.dto.CartAccount;

public class TestEmbeddedKey {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		CartAccount account = new CartAccount();
		account.setName("Aron");
		account.setGender("Male");
		account.setPassword("1234");

		AccountId accountId = new AccountId();
		accountId.setEmail("aronn@gmail.com");
		accountId.setPhone(123455);

		account.setAccid(accountId);

		entityTransaction.begin();

		entityManager.persist(account);

		entityTransaction.commit();

	}

}
