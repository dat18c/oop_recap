package com.kea.ooprecap;

public class Main {

    public static void main(String[] args) {
	// Initialize Machine & turnOn /Off
        Machine m = new Machine();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);
        m.turnOff();
        System.out.println(m);

    }
}
