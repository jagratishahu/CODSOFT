package com.taskSecond.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int totalMarks = 0;
	        System.out.print("Enter marks obtained in 5 subject out off 100 ");
	        for (int i = 1; i <= 5; i++) 
	        {
	        	System.out.print("\nSubject " + i + ": ");
	            int marks = scanner.nextInt();
	            totalMarks += marks;
	        }

	        double percentage = (double) totalMarks / (5 * 100) * 100;

	        char grade;
	        if (percentage >= 90) {
	            grade = 'A';
	        } else if (percentage >= 80) {
	            grade = 'B';
	        } else if (percentage >= 70) {
	            grade = 'C';
	        } else if (percentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("----------------------------");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Student Average Percentage: " + percentage + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
}
