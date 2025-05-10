package com.basics;
interface Sample {
    void m1();
    void m2();
}

interface SampleChild extends Sample {
    void m3();
    void m4();
}

class ChildSample implements SampleChild {

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
public class Interface_Inheritence {
    public static void main(String[] args) {

    }
}
