package patterns.decorator;
// 具体装饰类
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        String decription = super.getDescription();
        return decription + "加牛奶";
    }
    @Override
    public double getCost() {
        double cost = super.getCost();
        return cost + 6.0;
    }
}
