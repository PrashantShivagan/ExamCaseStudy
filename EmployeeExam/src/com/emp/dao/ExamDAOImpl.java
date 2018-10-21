package com.emp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.emp.dto.Exam;
import com.emp.exception.ExamException;

public class ExamDAOImpl implements ExamDAO {
	
	HashMap<Integer, Exam> map;
	
	public ExamDAOImpl() {
		// TODO Auto-generated constructor stub
		map = DataStore.createCollection();
	}

	@Override
	public int addStudent(Exam e) throws ExamException {
		// TODO Auto-generated method stub
		int id = (int) (1000 * (Math.random()));
		map.put(id, e);
		return id;
	}

	@Override
	public Exam getStudent(int id) throws ExamException {
		// TODO Auto-generated method stub
		Exam e = map.get(id);
		return e;
//		return map.get(id);
	}

	@Override
	public ArrayList<Exam> showStudent(String projectName) throws ExamException {
		// TODO Auto-generated method stub
		ArrayList<Exam> list = new ArrayList<Exam>();
		Set<Integer> set = map.keySet();
		for(Integer i : set){
			Exam e = map.get(i);
			if(e.getpName().equals(projectName)){
				list.add(e);
			}
		}
		return list;
	}

}
