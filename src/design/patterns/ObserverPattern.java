package design.patterns;

import java.util.Observable;
import java.util.Observer;


class Test extends Observable {
    public void run() {
        setChanged();
        notifyObservers("Testowanie obserwatora");
    }
}

class ObserverTest implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Obiekt: " + o.getClass().getName() + ", Wiadomość: " + arg.toString());
    }
}


public class ObserverPattern {
    public static void main(String []args) {
        Test test = new Test();
        ObserverTest observerTest = new ObserverTest();
        test.addObserver(observerTest);
        test.run();
    }

}
