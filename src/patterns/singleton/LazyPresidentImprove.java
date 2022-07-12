package patterns.singleton;

public class LazyPresidentImprove {
    //2.成员变量私有静态
    private static LazyPresidentImprove president = null;

    //1.构造方法私有
    private LazyPresidentImprove(){}

    //3.方法公开静态
    public static LazyPresidentImprove getInstance(){
        System.out.println("获取实例对象");
        if (president == null) {
            synchronized (LazyPresidentImprove.class) {
                if (president == null) {
                    president = new LazyPresidentImprove();
                }
            }
        }
        return president;
    }


}
