package com.basics;
class MyEmp{
    private int id;
    private String name;
    float salary;

    //constructors
    public MyEmp(int a,String b){
        id = a;
        name = b;
    }

    MyEmp(){
        salary = 10;
    }
    public void setName(String n){ //setter
        name = n;
    }
    public String getName(){//getter
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public float getSalary(){
       return salary;
    }
}
public class constructors {
 public static void main(String[] args) {
     //using the constructors
     MyEmp kusum = new MyEmp();
  kusum.setId(1);
  kusum.setName("Jack");
     System.out.println(kusum.getName() + " = " + kusum.getId() + " " + kusum.getSalary());
//     System.out.println(sujan.getName() + " = " + sujan.getId());
 }
}
