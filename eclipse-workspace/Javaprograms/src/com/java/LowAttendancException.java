package com.java;

public class LowAttendancException extends RuntimeException{

	public LowAttendancException(String msg) {
	    // TODO Auto-generated constructor stub
	    System.out.println(msg);
	  }

	  public LowAttendancException() {
	    // TODO Auto-generated constructor stub
	  }

	  public void allowForExams(int attendance)
	  {
	    //100/0
	    //-5
	    //
	    if(attendance>=75)
	    {
	      System.out.println("Permit Students");
	    }
	    else
	    {
	      
	//LowAttendanceException lae = new LowAttendanceException();
	throw new LowAttendancException("Low Attendance Issue"); //Anonymous Object
	      
	    }
	    
	  }
	  
	  
	  
	}

	    
	  

