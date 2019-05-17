package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements MySubject{
    private String title;

    private List<MyObserver> observers = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.notifyObeserver();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        if (!observers.isEmpty()){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObeserver() {
        for (int i = 0; i < observers.size(); i ++){
            MyObserver myObserver = observers.get(i);
            myObserver.update(this.title);
        }
    }
}
