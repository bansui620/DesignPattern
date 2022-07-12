package patterns.decorator;
// 具体组件
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso 咖啡";
    }
    @Override
    public double getCost() {
        return 25.00;
    }
}
