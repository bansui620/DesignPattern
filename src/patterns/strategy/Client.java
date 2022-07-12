package patterns.strategy;

public class Client {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(30.0);
        System.out.println("原票价为30.0元！");

        ticket.setDiscount(new StudentDiscount());
        System.out.println("当前的票价是："+ticket.getPrice());

        ticket.setDiscount(new VIPDiscount());
        System.out.println("当前的票价是："+ticket.getPrice());

        ticket.setDiscount(new ChildrenDiscount());
        System.out.println("当前的票价是："+ticket.getPrice());
    }
}
