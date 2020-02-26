package com.student.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.student.bo.IStudentBO;

/**
 * 
 * student service endpoint
 */

// this interface expose web service to be called by client
@WebService
public interface IStudentEP {

	@WebMethod
	String getStudent(Long id);
}
