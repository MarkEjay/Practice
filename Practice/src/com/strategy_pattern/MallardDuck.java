package com.strategy_pattern;

import com.strategy_pattern.fly.FlyNoWay;
import com.strategy_pattern.quack.Quack;

public class MallardDuck extends Duck  {

    public MallardDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }

}
