package springUsed.proxy.staticProxy.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房主出租房子，但是会添加附加属性
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
