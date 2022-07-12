package patterns.decorator;
// 抽象装饰类
public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
