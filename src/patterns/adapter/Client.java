package patterns.adapter;

//对象适配器模式
/*CarController类充当抽象目标
* PoliceSound和PoliceLamp类充当适配者
* PoliceCarAdapter 充当适配器
 */
public class Client {
    public static void main(String[] args) {
        PoliceCarAdapter pca = new PoliceCarAdapter();
        pca.move();
        pca.phonate();
        pca.twinkle();
    }
}
