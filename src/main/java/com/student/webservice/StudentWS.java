package com.student.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.student.bo.IStudentBO;

@WebService
public class StudentWS implements IStudentEP {

	@WebMethod
	public String getStudent(Long id) {
		return null;
	}

	
}
