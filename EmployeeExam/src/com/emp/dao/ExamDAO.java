package com.emp.dao;

import java.util.ArrayList;

import com.emp.dto.Exam;
import com.emp.exception.ExamException;

public interface ExamDAO {
	
	public int addStudent(Exam e) throws ExamException;
	public Exam getStudent(int id) throws ExamException;
	public ArrayList<Exam> showStudent(String projectName) throws ExamException;
	
}
