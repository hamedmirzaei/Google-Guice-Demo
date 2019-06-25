package com.revolut.hm.task;

import javax.inject.Inject;

public class DrawRequestSubClass extends DrawRequest {

    @Inject
    public DrawRequestSubClass(DrawShape drawShape) {
        super(drawShape);
    }

    @Override
    public void makeRequest() {
        System.out.println("In DrawRequestSubClass");
        super.makeRequest();
    }
}
