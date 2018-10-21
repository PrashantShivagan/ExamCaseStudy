package com.emp.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.emp.dao.ExamDAO;
import com.emp.dao.ExamDAOImpl;
import com.emp.dto.Exam;
import com.emp.exception.ExamException;

public class ExamServiceImpl implements ExamService {
	
	ExamDAO dao;
	
	public ExamServiceImpl() {
		// TODO Auto-generated constructor stub
		dao = new ExamDAOImpl();
	}

	@Override
	public int addStudent(Exam e) throws ExamException {
		// TODO Auto-generated method stub
		int i = 0;
		if(validateName(e.getName())==true && validateSalary(e.getSalary())==true && validatePNAME(e.getpName())==true)
		    i = dao.addStudent(e);
		if(i == 0)
			throw new ExamException("Invalid details for the object Exam");
		return i;
	}

	@Override
	public Exam getStudent(int id) throws ExamException {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}

	@Override
	public ArrayList<Exam> showStudent(String projectName) throws ExamException {
		// TODO Auto-generated method stub
		return dao.showStudent(projectName);
	}

	@Override
	public boolean validateName(String name) throws ExamException {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[A-Z][a-z]{2,12}");
		Matcher m = pat.matcher(name);
		if(m.matches()==false)
			throw new ExamException("");
		return m.matches();
	}

	@Override
	public boolean validateSalary(double sal) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[1-9][0-9.]{1,}");
		Matcher m = pat.matcher(String.valueOf(sal));
		return m.matches();
	}

	@Override
	public boolean validatePNAME(String pn) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[A-Z]{3}");
		Matcher m = pat.matcher(pn);
		return m.matches();
	}

	@Override
	public boolean validateID(int id) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[1-9][0-9]{2}");
		Matcher m = pat.matcher(String.valueOf(id));
		return m.matches();
	}

}
