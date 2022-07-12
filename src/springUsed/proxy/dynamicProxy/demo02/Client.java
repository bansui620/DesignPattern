package springUsed.proxy.dynamicProxy.demo02;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host2 host = new Host2();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host); //设置要代理的对象
        //动态生成代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}