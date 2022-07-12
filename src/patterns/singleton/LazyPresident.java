package patterns.singleton;

public class LazyPresident {
    //2.成员变量私有静态
    private static LazyPresident president = null;

    //1.构造方法私有
    private LazyPresident(){}

    //3.方法公开静态
    public static LazyPresident getInstance(){
        if (president==null){
            president = new LazyPresident();
        }
        System.out.println("获取实例对象");
        return president;
    }

}
