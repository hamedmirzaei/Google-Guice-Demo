package com.revolut.hm.task;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.revolut.hm.task.annot.*;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // if the user asks for DrawShape, Guice should provide a DrawSquare object
        // interface to concrete class binding
        bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Blue");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(5);
        bind(DrawRequest.class).in(Scopes.SINGLETON);

        // parent to child binding
        //bind(DrawRequest.class).to(DrawRequestSubClass.class);
    }
}
