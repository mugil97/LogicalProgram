package com.java;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LowAttendancException ll = new LowAttendancException();
		try {
			
			ll.allowForExams(65);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("check");
		}
		
	}

}
