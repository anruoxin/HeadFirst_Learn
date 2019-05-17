package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        BlackBoardObserver blackBoardObserver = new BlackBoardObserver(concreteSubject);
        blackBoardObserver.setName("老王");
        BlackBoardObserver blackBoardObserver1 = new BlackBoardObserver(concreteSubject);
        blackBoardObserver1.setName("老李");
        concreteSubject.setTitle("lalala");
        blackBoardObserver1.cancelRegister();
        concreteSubject.setTitle("hahaha");
    }
}
