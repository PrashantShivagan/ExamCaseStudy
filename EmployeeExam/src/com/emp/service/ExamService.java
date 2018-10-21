package com.emp.service;

import java.util.ArrayList;

import com.emp.dto.Exam;
import com.emp.exception.ExamException;

public interface ExamService {
	
	public int addStudent(Exam e) throws ExamException;
	public Exam getStudent(int id) throws ExamException;
	public ArrayList<Exam> showStudent(String projectName) throws ExamException;
	public boolean validateName(String name) throws ExamException;
	public boolean validateSalary(double sal);
	public boolean validatePNAME(String pn);
	public boolean validateID(int id);

}
