package com.iu.main.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		StudentController studentController = new StudentController();
		studentController.controller();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
