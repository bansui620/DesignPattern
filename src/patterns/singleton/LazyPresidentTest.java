package patterns.singleton;

public class LazyPresidentTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExetorThread());
        Thread thread2 = new Thread(new ExetorThread());
        thread1.start();
        thread2.start();
    }

}

class ExetorThread implements Runnable{

    @Override
    public void run() {
        LazyPresident lazyPresident = LazyPresident.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyPresident);

        LazyPresidentImprove lazyPresidentImprove = LazyPresidentImprove.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyPresidentImprove);
    }
}