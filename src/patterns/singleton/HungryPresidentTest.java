package patterns.singleton;

public class HungryPresidentTest {

    public static void main(String[] args) {
        new Thread(()->{
            HungryPresident instance = HungryPresident.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            HungryPresident instance = HungryPresident.getInstance();
            System.out.println(instance);
        }).start();
    }
}
