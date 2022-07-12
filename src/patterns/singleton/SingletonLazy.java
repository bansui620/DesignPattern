package patterns.singleton;

public class SingletonLazy {
    public static void main(String[] args) {
        President president = President.getInstance();
        president.getName();
        President president2 = President.getInstance();

        if (president==president2){
            System.out.println("他们是同一个人！");
        }else {
            System.out.println("他们不是同一个人！");
        }
    }
}
