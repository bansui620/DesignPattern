package patterns.decorator;
// 客户端测试类
public class StarBuzzCoffee {
	public static void main(String args[]) {
		String decription;
		double cost;
		Beverage beverage;
		beverage = new Espresso();
		decription = beverage.getDescription();
		cost = beverage.getCost();
		System.out.println("饮料：" + decription);
		System.out.println("价格：" + cost);
		System.out.println("---------------------");

		Beverage beverage_m;
		beverage_m = new Milk(beverage);
		decription = beverage_m.getDescription();
		cost = beverage_m.getCost();
		System.out.println("饮料：" + decription);
		System.out.println("价格：" + cost);
		System.out.println("---------------------");

		Beverage beverage_mo;
		beverage_mo = new Mocha(beverage_m);
		decription = beverage_mo.getDescription();
		cost = beverage_mo.getCost();
		System.out.println("饮料：" + decription);
		System.out.println("价格：" + cost);
		System.out.println("---------------------");

	}
}
