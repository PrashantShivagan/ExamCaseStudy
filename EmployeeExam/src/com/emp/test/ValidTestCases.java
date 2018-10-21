package com.emp.test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Test;

import com.emp.dto.Exam;
import com.emp.exception.ExamException;
import com.emp.service.ExamService;
import com.emp.service.ExamServiceImpl;


public class ValidTestCases {
	ExamService service = new ExamServiceImpl();
	
	@Test
	public void validName() throws ExamException{
		assertEquals(true, service.validateName("Vamshi"));
	}
	@Test (expected =ExamException.class)
	public void vaidNameV2() throws ExamException{
		service.validateName("vamshi");
		service.validateName("vamshi@");
		service.validateName("vamshi123");
		service.validateName("vamshi 1234");
	}

	@Test (expected = ExamException.class)
	public void validMethodADD()throws ExamException {
		service.addStudent(new Exam("vamshi", 5000.00, "abc"));
	}

}
