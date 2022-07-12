package patterns.strategy;

public class ChildrenDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price>20){
            return price - 10;
        }else{
            return price;
        }
    }
}
