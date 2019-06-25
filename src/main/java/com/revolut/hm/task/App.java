package com.revolut.hm.task;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App  {
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new AppModule());
        DrawRequest drawRequest1 = injector.getInstance(DrawRequest.class);
        drawRequest1.makeRequest();

        DrawRequest drawRequest2 = injector.getInstance(DrawRequest.class);
        drawRequest2.makeRequest();

        if (drawRequest1 == drawRequest2)
            System.out.println("Yes! the DrawRequest is SINGLETON");
        else
            System.out.println("No! the two DrawSquare objects are unique");
    }
}
