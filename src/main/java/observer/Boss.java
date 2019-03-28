package observer;

import template.SuperPaper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Boss implements Subject{
    private List<Observer> observers;

    public Boss() {
        this(new ArrayList<>());
    }

    public Boss(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deatach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update() {
        System.out.println("老板回来了！");
        observers.forEach(Observer::update);
    }
}
