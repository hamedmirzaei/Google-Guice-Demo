package com.revolut.hm.task;

import com.revolut.hm.task.annot.ColorValue;
import com.revolut.hm.task.annot.EdgeValue;
import com.revolut.hm.task.annot.RadiusValue;

import javax.inject.Inject;

public class DrawCircle implements DrawShape {

    private String color;
    private Integer radius;

    @Inject
    public DrawCircle(@ColorValue String color, @RadiusValue Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color " + color + " and of radius " + radius + "!");
    }
}
