package com.raghav.composite;

import java.util.RandomAccess;

public class CompositeTest {

    public static void main(String[] args) {
	// write your code here
        Component hd = new Leaf(4000,"HDD");
        Component mouse = new Leaf(500,"Mouse");
        Component monitor = new Leaf(18000,"Monitor");
        Component Ram = new Leaf(2000,"RAM");
        Component CPU = new Leaf(10000,"CPU");


        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");


        mb.addComponents(CPU, Ram);
        ph.addComponents(mouse, monitor);
        cabinet.addComponents(hd, mb);

        computer.addComponents(ph,cabinet);


        computer.showPrice();
    }
}
