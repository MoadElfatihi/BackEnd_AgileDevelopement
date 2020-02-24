package com.student.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.user.bo.UserBO;

@Entity
@Table(name="student")
public class StudentBO extends UserBO implements IStudentBO {
	@Id
	@Column(name="pk_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	// college or baclaureate , phd
	@Column(name="LEVEL_OF_STUDIES")
	private String levelOfStudies;


	public StudentBO() {
		super();
	}

	public StudentBO(String levelOfStudies) {
		super();
		this.levelOfStudies = levelOfStudies;
	}

	public String getLevelOfStudies() {
		return levelOfStudies;
	}

	public void setLevelOfStudies(String levelOfStudies) {
		this.levelOfStudies = levelOfStudies;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "StudentBO [id=" + id + ", levelOfStudies=" + levelOfStudies + "]";
	}
}
