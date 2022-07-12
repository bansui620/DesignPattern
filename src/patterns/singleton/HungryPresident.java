package patterns.singleton;

public class HungryPresident {

    //2.成员变量私有静态
    private static HungryPresident president = new HungryPresident();
    //1.构造方法私有
    private HungryPresident(){
        System.out.println("饿汉单例的构造方法被调用");
    }
    //3.方法公开静态
    public static HungryPresident getInstance(){
        System.out.println("获取实例对象");
        return president;
    }
}
