package com.kea.ooprecap;

public class Machine {
    //super class
    //field
    private boolean isOn;

    //constructor
    public Machine()
    {
        isOn = false;
    }

    //getters & setters
    public void turnOn()
    {
        //tænd = isOn
        isOn = true;
    }

    public void turnOff()
    {
        //sluk = !isOn
        isOn = false;
    }

    @Override
    public String toString()
    {
        if (this.isOn) {
            return ("I'm on");
        }
        else
        {
            return("I'm off listening to Fear Inoculum!");
        }
    }

}
