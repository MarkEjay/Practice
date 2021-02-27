package com.intro_design;

import com.intro_design.fly.FlyBehavior;
import com.intro_design.fly.FlyNoWay;
import com.intro_design.fly.FlyWithWings;

public class DesignMain {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        FlyBehavior fb = new FlyWithWings();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();

        mallard.performQuack();
    }
}
