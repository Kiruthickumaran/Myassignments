package org.student;

import org.department.Department;

public class Student extends Department {
   public void studentName() {
	   System.out.println("Vikram");
   }
   public void studentDepartment() {
	   System.out.println("Agriculture Engineering");
   }
   public void studentId() {
	   System.out.println("2001");
  }
   
   public static void main(String[] args) {
	   Student  studies=new Student();
	   studies.collegeName();
	   studies.collegeCode();
	   studies.collegeRank();
	   studies.Department();
	   studies.studentName();
	   studies.studentDepartment();
	   studies.studentId();
}
}
