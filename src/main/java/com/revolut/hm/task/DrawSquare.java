package com.revolut.hm.task;

import com.revolut.hm.task.annot.ColorValue;
import com.revolut.hm.task.annot.EdgeValue;

import javax.inject.Inject;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square of color " + color + " and of edge " + edge + "!");
    }
}
