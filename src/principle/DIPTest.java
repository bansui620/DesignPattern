package principle;

//依赖倒置原则
public class DIPTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("顾客购买以下商品：");
        customer.shopping(new ShaoguanShop());
        customer.shopping(new WuyuanShop());

    }
}

interface Shop{
    public String sell();
}

class ShaoguanShop implements Shop{
    @Override
    public String sell() {
        return "韶关土特产：香菇、木耳……";
    }
}

class WuyuanShop implements Shop{
    @Override
    public String sell() {
        return "婺源土特产：绿茶、酒槽鱼……";
    }
}

class Customer{

    //顾客购物
    public void shopping(Shop shop){
        System.out.println(shop.sell());
    }
}