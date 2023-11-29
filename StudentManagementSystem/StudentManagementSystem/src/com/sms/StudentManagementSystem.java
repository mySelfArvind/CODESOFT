package com.sms;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Get All student");
            System.out.println("5. Update student");
            System.out.println("6. Exit");
            System.out.print("Select operation to Peform: ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1: {
                    System.out.println("Enter Student Information");
                    System.out.print("Student roll:");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Student std: ");
                    String std = scanner.nextLine();

                    student.addStudent(roll, grade, name, std);
                    break;
                }
                case 2: {
                    System.out.println("Enter Student Information");
                    System.out.print("Student roll:");
                    int roll = scanner.nextInt();
                    student.removeStudent(roll);
                    break;
                }
                case 3: {
                    System.out.println("Enter Student Information");
                    System.out.print("Student roll:");
                    int roll = scanner.nextInt();
                    student.getStudent(roll);
                    break;
                }
                case 4: {
                    student.getAllStudent();
                    break;
                }
                case 5: {
                    System.out.println("Enter Updated Student Information");
                    System.out.print("Student roll:");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Student std: ");
                    String std = scanner.nextLine();
                    student.updateStudent(roll, grade, name, std);
                    break;
                }
                case 6: {
                    f = false;
                    break;
                }
                default: {
                    System.out.println("Please select a valid number");
                }
            }
        }

    }
}
