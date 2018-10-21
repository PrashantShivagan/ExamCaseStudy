package com.emp.dao;

import java.util.HashMap;

import com.emp.dto.Exam;

public class DataStore {
	
	public static HashMap<Integer, Exam> map;
	public static HashMap<Integer, Exam> createCollection(){
		if(map == null)
			map = new HashMap<Integer, Exam>();
		return map;
	}
	
}
