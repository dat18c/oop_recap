package com.kea.ooprecap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Initialize Machine & turnOn /Off
        Machine m = new Machine();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);
        m.turnOff();
        System.out.println(m);

        /*
        // brug Printer
        Printer p = new Printer();
        p.turnOn();
        p.print("Fear Inoculum", 4);
        p.turnOff();
        System.out.println(p);
        */

        List<Machine> machines = new ArrayList<>();
        machines.add(new Printer());
        machines.add(new Radio());
        machines.add(new Machine());

        //iterer
        for (Machine ma: machines) {
            //tænd
            ma.turnOn();
            System.out.println(ma);

            //hvis Printer, så print
            if (ma instanceof Printer)
            {
                ((Printer) ma).print("Hej - tid for opgave!", 5);
            }
        }
    }
}
