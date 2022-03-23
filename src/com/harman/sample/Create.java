package com.harman.sample;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {

        try {
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false",
                    "root","");
            String name, roll, admn, col;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Name: ");
            name = input.nextLine();
            System.out.println("Enter Roll Number: ");
            roll = input.nextLine();
            System.out.println("Enter Admission Number: ");
            admn = input.nextLine();
            System.out.println("Enter College Name: ");
            col = input.nextLine();
            Statement s = (Statement) c.createStatement();
            s.executeUpdate("INSERT INTO `students`(`Name`, `Roll_No`, `Admn_No`, `College`) " +
                    "VALUES ('"+name+"', "+roll+", "+admn+", '"+col+"')");
            System.out.println("Inserted Successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
