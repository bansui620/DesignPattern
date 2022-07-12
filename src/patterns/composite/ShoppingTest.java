package patterns.composite;
public class ShoppingTest {
    public static void main(String[] args) {
        float sum = 0;
        Bags bigBag,mediumBag,smallRedBag,smallWhiteBag;
        Goods sp;
        bigBag=new Bags("大袋子");
        mediumBag=new Bags("中袋子");
        smallRedBag=new Bags("红色小袋子");
        smallWhiteBag=new Bags("白色小袋子");
        sp=new Goods("婺源特产",2,7.9f);
        smallRedBag.add(sp);
        sp=new Goods("婺源地图",1,9.9f);
        smallRedBag.add(sp);
        sp=new Goods("韶关香菇",2,68);
        smallWhiteBag.add(sp);
        sp=new Goods("韶关红茶",3,180);
        smallWhiteBag.add(sp);
        sp=new Goods("景德镇瓷器",1,380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp=new Goods("李宁牌运动鞋",1,198);
        bigBag.add(sp);
        bigBag.add(mediumBag);
        bigBag.add(smallWhiteBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        sum=bigBag.calculation();
        System.out.println("要支付的总价是："+sum+"元");


        bigBag.getChild(1).show();
        bigBag.getChild(2).show();

    }
}

