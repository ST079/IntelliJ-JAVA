package com.basics;

class Emp{
    private int id;
    private String name;

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
}

public class AccessModifiers {
    public static void main(String[] args) {
        Emp sujan = new Emp();
        sujan.setName("Sujan"); //creating instantation of a class Emp
        System.out.println(sujan.getName());

    }
}
