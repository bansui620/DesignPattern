package springUsed.lazySingleton;

//线程类
class ExetorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        LazySynchronized singleton = LazySynchronized.getInstance();
//        LazyDoubleCheck singleton = LazyDoubleCheck.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}

public class LazyTest {
    public static void main(String[] args) {
    		Thread t1 = new Thread(new ExetorThread());
    		Thread t2= new Thread(new ExetorThread());
    		t1.start();
    		t2.start();
    }
}


