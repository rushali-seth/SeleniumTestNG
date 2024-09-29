package MOSelenium.MOSel;

import java.util.Scanner;

public class StudentManagment {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int noOfStudents = sc.nextInt();//
        Student[] sd = new Student[noOfStudents];

        // Jave, python, jscript

        for(int i=0; i<noOfStudents; i++){
            System.out.println("Enter student " + (i+1) +  "details:" );
            System.out.println("Enter firstname" );
            String fName = sc.next();
            System.out.println("Enter lastName" );
            String lName = sc.next();
            System.out.println("Enter emailID" );
            String eID = sc.next();
            System.out.println("Enter studentID" );
            int studID = sc.nextInt();
            System.out.println("Enter Number of courses" );
            int count = sc.nextInt();
            String[] courses=new String[count];
            for(int j=0; j< courses.length; j++){
                System.out.println("Enter" +(j+1)+ "courseName" );
                String courseName = sc.next();
                courses[j] = courseName;

            }

            Student studentDetails = new Student(fName, lName, eID, studID, courses);
                        sd[i]=studentDetails;

        }

        for(Student Student: sd){
            System.out.println(Student.firstName +","+ Student.lastName +","+ Student.emailID +"," + Student.studentID + "," );
              System.out.println("Courses availaed");
              
        }

    }



}
