package com.brandine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(nullable = false)
	private String schoolClass;
	@Column(nullable = false)
	private double note1;
	@Column(nullable = false)
	private double note2;
	@Column(nullable = false)
	private double note3;
	@Column(nullable = false)
	private double note4;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}
	public double getNote1() {
		return note1;
	}
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	public double getNote2() {
		return note2;
	}
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	public double getNote3() {
		return note3;
	}
	public void setNote3(double note3) {
		this.note3 = note3;
	}
	public double getNote4() {
		return note4;
	}
	public void setNote4(double note4) {
		this.note4 = note4;
	}
	
	@Override
	public String toString() {
		return "Note [id=" + id + ", schoolClass=" + schoolClass + ", note1=" + note1 + ", note2=" + note2 + ", note3="
				+ note3 + ", note4=" + note4 + "]";
	}

	
	

}
