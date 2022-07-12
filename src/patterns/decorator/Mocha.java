package patterns.decorator;
// 具体装饰类
class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        String decription = super.getDescription();
        return decription + "加摩卡";
    }
    @Override
    public double getCost() {
        double cost = super.getCost();
        return cost + 10.0;
    }
}
