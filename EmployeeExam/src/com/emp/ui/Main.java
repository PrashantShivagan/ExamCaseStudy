package com.emp.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.emp.dto.Exam;
import com.emp.exception.ExamException;
import com.emp.service.ExamService;
import com.emp.service.ExamServiceImpl;

public class Main {

	public static void main(String[] args) throws ExamException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExamService service = new ExamServiceImpl();

		int option = 0;
		do {
			System.out.println("1. Add a student...");
			System.out.println("2. Get student id...");
			System.out.println("3. Show entire student list...");
			System.out.println("4. Exit...");
			option = sc.nextInt();

			switch (option) {
			case 1:
				
				System.out.println("Enter Student name: ");
				String name = sc.next();
				if(service.validateName(name)==false){
					throw new ExamException("Invalid name format");
				}
				System.out.println("Enter salary: ");
				double sal = sc.nextDouble();
				if(service.validateSalary(sal)==false){
					throw new ExamException("Invalid salary format");
				}
				System.out.println("Enter Project name: ");
				String pName = sc.next();
				if(service.validatePNAME(pName)==false){
					throw new ExamException("Invalid project name format");
				}
				
				Exam e = new Exam(name, sal, pName);
				int id = service.addStudent(e);
				e.setId(id);
				System.out.println("Successfully insertd with id "+id);
				System.out.println(e);
				
				break;

			case 2:
				
				System.out.println("Enter a valid ID: ");
				int eId = sc.nextInt();
				
				Exam ee = service.getStudent(eId);
				System.out.println(ee);
				
				break;

			case 3:
				
				System.out.println("Enter project name: ");
				String pn = sc.next();
				
				ArrayList<Exam> arr = service.showStudent(pn);
				for(Exam e1 : arr)
					System.out.println(e1);
				
				break;

			default:
			case 4:

				break;
			}

		} while (option != 4);

		sc.close();
	}

}
