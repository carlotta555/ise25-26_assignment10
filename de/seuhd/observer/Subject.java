package de.seuhd.observer;

public abstract class Subject {
ConcreteSubject subject;
    void attach(Observer observer) {
    attach(observer);
    }

    void detach(Observer observer) {
        detach(observer);
    }

    protected void notifyObservers() {
        if(!subject.equals(null)){
        System.out.println("Sending update to observers..");
    }
    }
}
