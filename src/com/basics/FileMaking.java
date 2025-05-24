package com.basics;

import java.io.*;
import java.util.Scanner;

class Students {
    int roll;
    String name, address, clz;

    public Students(int roll, String name, String address, String clz) {
        this.roll= roll;
        this.name = name;
        this.address = address;
        this.clz = clz;
    }
}

public class FileMaking {
    public static void main(String[] args) {
        //creating a new file
        try{
            File file = new File("New_students.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writing to a file
        try {
            Student s1 = new Student(1, "Sujan Tamang", "Bhaktapur", "BMC");
            Student s2 = new Student(1, "Kusum Darlami", "Kathmandu", "BMC");

            FileWriter fileWriter = new FileWriter("New_students.txt");
            fileWriter.write("Student Roll: "+s1.roll+" ");
            fileWriter.write("Student Name: "+s1.name+" ");
            fileWriter.write("Student Address: "+s1.address+" ");
            fileWriter.write("Student Clz: "+s1.clz+"\n");
            fileWriter.write("Student Roll: "+s2.roll+" ");
            fileWriter.write("Student Name: "+s2.name+" ");
            fileWriter.write("Student Address: "+s2.address+" ");
            fileWriter.write("Student Clz: "+s2.clz+" ");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //reading a file
        try {
            File file = new File("New_students.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.contains("Kathmandu")) {
                    System.out.println(line);
                }
                sc.close();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
