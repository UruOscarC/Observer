package com.ogcg.observer;

class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    public void update() {
        System.out.print(" Octal:" + Integer.toOctalString(subject.getState()));
    }
}
