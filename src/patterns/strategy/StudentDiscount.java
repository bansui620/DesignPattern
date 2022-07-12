package patterns.strategy;

public class StudentDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return 0.8*price;
    }
}
