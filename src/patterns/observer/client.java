package patterns.observer;

public class client {
    public static void main(String[] args) {
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("MYSeig");
        Observer player1,player2,player3,player4;
        player1 = new Player();
        player1.setName("张三");
        acc.join(player1);
        player2 = new Player();
        player2.setName("李四");
        acc.join(player2);
        player3 = new Player();
        player3.setName("王五");
        acc.join(player3);
        player4 = new Player();
        player4.setName("伴随~");
        acc.join(player4);

        acc.quit(player2);

        player4.beAttacked(acc);

    }
}
