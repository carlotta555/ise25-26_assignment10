package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    ConcreteSubject concreteSubject;
    int n = 0;

    public ConcreteObserver(ConcreteSubject subject) {
        this.concreteSubject = subject;
        n++;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Observer" + n + "received update from subject: New value is " + concreteSubject.value);
    }

    public void detach() {
      this.concreteSubject = null;
    }
}
