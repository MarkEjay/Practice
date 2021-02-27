package com.intro_design;

import com.intro_design.fly.FlyBehavior;
import com.intro_design.fly.FlyNoWay;
import com.intro_design.fly.FlyWithWings;
import com.intro_design.quack.Quack;
import com.intro_design.quack.QuackBehavior;

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
