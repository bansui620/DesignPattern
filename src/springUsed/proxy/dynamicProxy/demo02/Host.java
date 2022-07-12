package springUsed.proxy.dynamicProxy.demo02;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子~");
    }

}
