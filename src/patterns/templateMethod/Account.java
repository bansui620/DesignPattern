package patterns.templateMethod;

//抽象类
public abstract class Account {
    protected String account;
    protected String password;
    protected double capital;

    //基本方法--具体方法
    public final boolean validate(String account,String password){
        if (account.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123456")) {
            System.out.println("用户信息正确！");
            return true;
        }
        else {
            return false;
        }
    }

    //基本方法--抽象方法
    public abstract void calculateInterest();

    //基本方法--具体方法(hook)
    public void display(){
        System.out.println("显示利息！");
    }


    //模板方法
    public final void handle(String account,String password){
        if (!validate(account,password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }
}
