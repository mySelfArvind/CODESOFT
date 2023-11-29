package com.sms;

import java.sql.*;

public class Student {
//    Connection variable

    private Connection conn;

//    adding student
    public void addStudent(int roll, String grade, String name, String std) {
        try {
            conn = DatabaseConnection.getConnection();

            String query = "insert into students(roll,grade,name,std) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ps.setString(2, grade);
            ps.setString(3, name);
            ps.setString(4, std);
            int i = ps.executeUpdate();
            if (i == 1) {
                System.out.println("Student added successfully...");
            } else {
                System.out.println("Something went wrong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    removing student
    public void removeStudent(int roll) {

        try {
            conn = DatabaseConnection.getConnection();
            String query = "delete from students where roll = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ps.executeUpdate();
            System.out.println("Student deleted successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    search student
    public Student getStudent(int roll) {

        try {
            conn = DatabaseConnection.getConnection();
            String query = "select * from students where roll = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int sroll = rs.getInt(1);
                String grade = rs.getString(2);
                String name = rs.getString(3);
                String std = rs.getString(4);
                System.out.println("Roll: " + sroll);
                System.out.println("Grade: " + grade);
                System.out.println("Name: " + name);
                System.out.println("Std: " + std);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Student student = new Student();

        return student;
    }

//    get all students
    public void getAllStudent() {
        try {
            conn = DatabaseConnection.getConnection();
            String query = "select * from students";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sroll = rs.getInt(1);
                String grade = rs.getString(2);
                String name = rs.getString(3);
                String std = rs.getString(4);
                System.out.println("Roll: " + sroll);
                System.out.println("Grade: " + grade);
                System.out.println("Name: " + name);
                System.out.println("Std: " + std);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    update Student
    public void updateStudent(int roll, String grade, String name, String std) {
        try {
            conn = DatabaseConnection.getConnection();

            String query = "update students set roll=?,grade=?,name=?,std=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ps.setString(2, grade);
            ps.setString(3, name);
            ps.setString(4, std);
            int i = ps.executeUpdate();
            if (i == 1) {
                System.out.println("Student updated successfully...");
            } else {
                System.out.println("Something went wrong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
