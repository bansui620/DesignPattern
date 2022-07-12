package springUsed.proxy.dynamicProxy.demo02;

public class Host2 implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子~");
    }
}
