package com.ogcg.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
