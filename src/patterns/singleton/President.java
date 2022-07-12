package patterns.singleton;

public class President {

    //保证instance在所有线程中同步
    private  static volatile President instance = null;

    private President(){
        System.out.println("产生一位总统！");
    }

    public static synchronized President getInstance(){
        if (instance == null){
            instance = new President();
        }else {
            System.out.println("已经有一位总统了，不能产生新总统！");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普！");
    }

}
