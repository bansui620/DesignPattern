package patterns.observer;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allyName;  //战队名
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer obs){
        players.add(obs); //加入战队
        System.out.println(obs.getName()+"加入"+this.allyName+"战队");
    }

    public void quit(Observer obs){
        players.remove(obs); //推出战队
        System.out.println(obs.getName()+"退出"+this.allyName+"战队");
    }

    public abstract void notifyObserve(String name);
}
