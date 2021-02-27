package com.strategy_pattern;

import com.strategy_pattern.fly.FlyBehavior;
import com.strategy_pattern.fly.FlyWithWings;

public class DesignMain {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        FlyBehavior fb = new FlyWithWings();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();

        mallard.performQuack();
    }
}
