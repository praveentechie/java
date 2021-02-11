package com.ap.runners;

import com.ap.runners.shared.Cycle;
import com.ap.runners.shared.Vehicle;

public class InheritanceRunner {
    public static void main(String[] args) {
        InheritanceRunner runner = new InheritanceRunner();
        runner.testInheritance();
    }

    public void testInheritance() {
        Vehicle vehicle = new Cycle();
        Cycle cycle = new Cycle();
        acceptParent(cycle);
        acceptParent(vehicle);

        acceptChild(cycle);
        // when type is child parent can't go through it :(
        //acceptChild(vehicle);
    }

    public void acceptParent(Vehicle vehicle) {
        System.out.println(vehicle);
    }

    public void acceptChild(Cycle cycle) {
        System.out.println(cycle);
    }
}
