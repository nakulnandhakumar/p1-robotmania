package BubbleSort;// Created by Nakul w/ help from Mr. Mortensen
import java.util.*;
import java.util.ArrayList;

public class Student extends Person {
    int grade;
    public Student() {
	  }

    public Student(String fname, String lname, int grade) { //General Student constructor
        this.gradeSetter(fname, lname, grade);
	  }

    protected void gradeSetter(String fname, String lname, int grade) { // student setter method
      this.grade = grade;
      super.roleSetter(fname, lname, ROLE.student); //super setter calls rolesetter from Person
	  }

    @Override
    public String toString() { //super toString override from Person
		  return (super.toString() + "\tGrade: " + this.grade); 
	  }

   // Using Student extended class for sorting grade of students with bubble sort method
  //  1. Added grade to Student class
  //  2. Made setter to support student grade
  //  3. Override Person toString to support grade

    public static void main(String[] args) {    //main method 
        Stack<Student> studentInfo = new Stack();
        Scanner input = new Scanner(System.in);
        Student student; //new student object

        int totalStudents;
        int exitFlag = 0;
        String catchBlankSpace;

        System.out.print("Input the total number of students you wish to add: ");
        totalStudents = input.nextInt();

        String[] studentFirstName = new String[totalStudents];
        String[] studentLastName = new String[totalStudents];
        int[] studentGrades = new int[totalStudents];

        for (int i = 0; i < totalStudents; i++) {      //Based on inputted # of students, loops through and adds same number of students by calling Students(); constructor 'i' times
            System.out.print("Student first name: ");
            if (exitFlag == 0){
                catchBlankSpace = input.nextLine();
                exitFlag = 1;
            }
            studentFirstName[i] = input.nextLine();

            System.out.print("Student last name: ");
            studentLastName[i] = input.nextLine();

            System.out.print("Student grade: ");
            studentGrades[i] = input.nextInt();

            student = new Student(studentFirstName[i], studentLastName[i], studentGrades[i]);
            studentInfo.push(student);  //Adds student info to list

            System.out.print("Would you like to delete the student you just entered? (Y/N): ");
            catchBlankSpace = input.nextLine();
            String userDeleteAnswer = input.nextLine();
            if (userDeleteAnswer.equals("Y")) {
                System.out.print("Student Number "+i+" has been deleted"+"\n");
                studentInfo.pop();
                i--;
            }
        }

        System.out.print("\n");               
        for(Student s: studentInfo) {    //For each loop cycles through arraylist positions and prints all informtion of student in that position
            System.out.println(s);
        }

        for (int j = 0; j < studentInfo.size(); j++) {  //nested loops for bubble sort
          for (int i = 0; i < studentInfo.size() - 1; i++) {
            int grade1;
            int grade2;

            Student first = studentInfo.get(i);       //Gets all information pertaining to student in position i and i+1
            Student second = studentInfo.get(i + 1);
            grade1 = first.grade;  //Specifically pulls the integer value of what grade their in from all information pertaing to this student in position i and i+1 of arraylist
            grade2 = second.grade;

            if (grade1 > grade2) {        //This is the actual bubble sort, tests whether grade value of one indice ahead is greater or not, if greater then swap positions
                studentInfo.set(i, second);     //Since we have already assigned the values to variable above, no need for temp variable to store data
                studentInfo.set(i + 1, first); //Swaps values between positions
            }
        }
      }

      System.out.print("\n");               
      for(Student s: studentInfo) {    //For each loop cycles through arraylist positions and prints all informtion of student in that position
          System.out.println(s);
      }
    }
}