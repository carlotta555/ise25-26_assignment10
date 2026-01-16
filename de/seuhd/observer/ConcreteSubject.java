package de.seuhd.observer;

public class ConcreteSubject {
    int value;
    Subject subject;
    public void setValue(int value)
    {
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        subject.notifyObservers();
    }
}
