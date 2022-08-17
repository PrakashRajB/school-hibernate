package com.ty.school.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Staff;

public class TestSaveStaff {

	public static void main(String[] args) {
          Staff staff=new Staff();
          staff.setName("RubyMartha");
          DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
          LocalDateTime dateTime=LocalDateTime.parse("12-08-2022 10:30",formatter);
          //LocalDateTime.of(2022,10,31,10,31,28);
          staff.setDoj(dateTime);
          DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
          LocalDate date=LocalDate.parse("14-11-1996",formatter1);
          //LocalDate.of(2022, 10, 31);
          staff.setBirthDate(date);
          LocalTime time=LocalTime.parse("12:30");
          //LocalTime.of(10, 30, 28)
          staff.setBirthTime(time);
          
          EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
          
          EntityManager entityManager=factory.createEntityManager();
          
          EntityTransaction transaction=entityManager.getTransaction();
          
          transaction.begin();
          
          entityManager.persist(staff);
          transaction.commit();
	}

}
