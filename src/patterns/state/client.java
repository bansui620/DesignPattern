package patterns.state;
public class client {
    public static void main(String[] args) {
        ScoreContext account=new ScoreContext();
        System.out.println("学生成绩状态测试，初始分值为0：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
