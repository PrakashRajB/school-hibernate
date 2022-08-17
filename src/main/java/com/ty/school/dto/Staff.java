package com.ty.school.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDateTime doj;
	private LocalDate birthDate;
	private LocalTime birthTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDoj() {
		return doj;
	}

	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalTime getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(LocalTime birthTime) {
		this.birthTime = birthTime;
	}

	@Override
	public String toString() {
		return "\nStaff [id=" + id + ", name=" + name + ", doj=" + doj + ", birthDate=" + birthDate + ", birthTime="
				+ birthTime + "]";
	}

}
