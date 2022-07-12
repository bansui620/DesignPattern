package patterns.decorator;
// 具体组件
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend 咖啡";
    }
    @Override
    public double getCost() {
        return 30.00;
    }
}
