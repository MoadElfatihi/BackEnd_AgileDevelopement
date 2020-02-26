package com.student.webservice;

import org.apache.cxf.frontend.ServerFactoryBean;

public class TestWS {

	public static void main(String[] args) {
		ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
		serverFactoryBean.setServiceClass(IStudentEP.class);
		serverFactoryBean.setAddress("http://localhost:8080/Student");
		serverFactoryBean.setServiceBean(new StudentWS());
		serverFactoryBean.create();
	}
}
