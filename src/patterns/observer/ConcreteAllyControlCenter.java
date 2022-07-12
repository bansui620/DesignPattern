package patterns.observer;

public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        this.allyName = allyName;
        System.out.println(this.allyName+"战队组建成功。。");
    }

    @Override
    public void notifyObserve(String name) {
        System.out.println(this.allyName+ "战队紧急通知，盟友"+name+"遭受攻击。。。");
        for (Observer obs : players) {
            if(!obs.getName().equalsIgnoreCase(name)){
                obs.help();
            }
        }
    }
}
