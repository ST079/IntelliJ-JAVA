package com.basics;

import java.sql.SQLOutput;

interface Camera{
    void takeSnap();
    void takeVideo();
    default void record4K(){
        greet();
        System.out.println("record4K");
    }
    private void greet(){
        System.out.println("Greeting");
    }
}

interface Wifi{
    String [] getNetworks();
    void ConnectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }


}

class SmartPhone extends CellPhone implements Camera, Wifi{

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting networks");
        String[] networks = {"ClassicTech","WorldLink","Vianet"};
        return networks;
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }
}

public class DefaultMethods {
public static void main(String[] args) {
    SmartPhone s=new SmartPhone();
    String[] netArr = s.getNetworks();
    for(String items: netArr){
        System.out.println(items);
    }
    s.record4K();
}
}
