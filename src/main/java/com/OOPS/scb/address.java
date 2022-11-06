package com.OOPS.scb;

public class address {
    public address(){
        doorNo = "D111";
        street = "Radha Nagar";
        city = "Chennai";
        pin = 600100;
    }
    //Data Members
    String doorNo;
    String street;
    String city;
    int pin;

    public void printAddress()
    {
        System.out.println(doorNo+"\n"+street+"\n"+city+"\n"+pin);
    }

}
