package springUsed.hungrySingleton;

/**
 * 饿汉式单例模式，在类加载的时候就立即初始化，并且创建单例对象。
 * 绝对线程安全，在线程还没出现之前就实例化了，不可能存在访问安全问题。
 * 优点：没有加任何锁、执行效率高，用户体验比懒汉式好。
 * 缺点：类加载的时候就初始化，不管用不用都占着空间，浪费了内存资源。
 * Spring中的IoC容器ApplicationContext就是饿汉式单例模式。
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("构造方法");
    }

    public static HungrySingleton getInstance(){
        System.out.println("getInstance");
        return hungrySingleton;
    }

}
