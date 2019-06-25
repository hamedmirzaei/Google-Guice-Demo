package com.revolut.hm.task;

import com.revolut.hm.task.annot.Circle;
import com.revolut.hm.task.annot.Square;

import javax.inject.Inject;

public class DrawRequest {

    DrawShape drawShape;

    // type 1: field injection
    @Inject
    @Square
    DrawShape anotherDrawShape;

    DrawShape andAnotherDrawShape;

    // type 2: constructor injection
    @Inject
    public DrawRequest(@Circle DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public DrawShape getAndAnotherDrawShape() {
        return andAnotherDrawShape;
    }

    // type 3: method injection
    @Inject
    public void setAndAnotherDrawShape(@Square DrawShape andAnotherDrawShape) {
        this.andAnotherDrawShape = andAnotherDrawShape;
    }

    public void makeRequest() {
        drawShape.draw();
        if (anotherDrawShape == andAnotherDrawShape)
            System.out.println("Yes! the Square is SINGLETON");
        else
            System.out.println("No! the two Square objects are unique");
    }
}
