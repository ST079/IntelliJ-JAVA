package com.basics;
import java.io.*;
class Student implements Serializable {
    int roll;
    String name, address, clz;

    public Student(int roll, String name, String address, String clz) {
        this.roll= roll;
        this.name = name;
        this.address = address;
        this.clz = clz;
    }
}
public class SerilizationEg {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1,"Sujan Tamang","Bhaktapur","BMC");
            Student s2 = new Student(1,"Kusum Darlami","Bhaktapur","BMC");
            Student s3 = new Student(1,"Nirajan Khadka","Kathmandu","BMC");
//            FileOutputStream fos = new FileOutputStream("Student.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s1);
//            oos.writeObject(s2);
//            oos.writeObject(s3);
//            oos.close();
//            fos.close();
//            File file = new File("student.txt");
//            file.createNewFile();
//            FileWriter fileWriter = new FileWriter("students.txt");
//            fileWriter.write("Student Roll: "+s1.roll+" ");
//            fileWriter.write("Student Name: "+s1.name+" ");
//            fileWriter.write("Student Address: "+s1.address+" ");
//            fileWriter.write("Student Clz: "+s1.clz+"\n");
//            fileWriter.write("Student Roll: "+s2.roll+" ");
//            fileWriter.write("Student Name: "+s2.name+" ");
//            fileWriter.write("Student Address: "+s2.address+" ");
//            fileWriter.write("Student Clz: "+s2.clz+" ");
//            fileWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
