import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

interface utility{
    // Functions
    public void setDetails();
    public void getDetails();
}

class Main{
      static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO UNIVERSITY MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD STUDENT \t\t\t 2].ADD FACULTY \t\t\t 3].ADD COURSE");
        System.out.println();
        System.out.println("4].GET STUDENT \t\t\t 5].GET FACULTY \t\t\t 6].GET COURSE");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Student
        int size =10;
        Student student[] = new Student[size];
        int student_counter=0;

//        Faculty
        Faculty faculty[] = new Faculty[size];
        int faculty_counter=0;

//        Course
        int course_counter=0;
        Course course[] = new Course[size];
        ArrayList<String> courses = new ArrayList<String>();

//        Choice
        Scanner sc = new Scanner(System.in);
        int choice = 100; // By default intialize with 100
        System.out.println(choice);


        while (choice!=0){
            main_menu();
            choice = Integer.parseInt(sc.nextLine());

            while (choice!=9 && choice!=0){
//                Switch
                switch (choice){
                    case 1:
                    student[student_counter] = new Student();
                    student[student_counter].setDetails();
                    student_counter++;
                    System.out.println();
                    System.out.println();
                    System.out.println("1].ADD NEW STUDENT: ");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = Integer.parseInt(sc.nextLine());
                    break;

                    case 2:
                        faculty[faculty_counter] = new Faculty();
                        faculty[faculty_counter].setDetails();
                        faculty_counter++;
                        System.out.println();
                        System.out.println();
                        System.out.println("2].ADD New Faculty: ");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = Integer.parseInt(sc.nextLine());
                        break;

                    case 3:
                        course[course_counter] = new Course();
//                        course.add(newCourse);
                        course[course_counter].setDetails();
//                        courses.add(course[course_counter]);
                        course_counter++;
                        System.out.println();
                        System.out.println();
                        System.out.println("3].ADD New Course: ");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = Integer.parseInt(sc.nextLine());
                        break;


                    case 4:
                        for (int i=0; i<student_counter;i++){
                            student[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = Integer.parseInt(sc.nextLine());
                        break;

                    case 5:
                        for (int i=0; i<faculty_counter;i++){
                            faculty[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = Integer.parseInt(sc.nextLine());
                        break;

                    case 6:
                        for (int i=0;i<course_counter;i++){
                        course[i].getDetails();
                        System.out.println();
                            System.out.println();
                    }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = Integer.parseInt(sc.nextLine());
                        break;


                }
            }

        }
    }}