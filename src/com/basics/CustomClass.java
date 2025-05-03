package com.basics;
class Employee{
    int id;
    String name;
    public void display()
    {
        System.out.println(id+" "+name);
    }}
public class CustomClass {
    public static void main(String[] args){
        System.out.println("This is a custom class");
        Employee sujan = new Employee();
        sujan.id = 1;
        sujan.name = "CodeSujan";
        sujan.display();

    }
}
