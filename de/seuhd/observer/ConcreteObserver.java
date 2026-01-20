package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    private static int counter = 0;
    private int id;
    private Subject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.id = ++counter;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        ConcreteSubject cs = (ConcreteSubject) subject;
        System.out.println(
                "Observer " + id +
                        " received update from subject : New value is " +
                        cs.getValue()
        );
    }

    public void detach() {
        if (subject != null) {
        subject.detach(this);
    }}
}
