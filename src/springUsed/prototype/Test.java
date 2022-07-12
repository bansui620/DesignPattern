package springUsed.prototype;

public class Test {

    //浅克隆
    public static void main(String[] args) {
        //浅克隆
        QiTianDaShengShallow shallow = new QiTianDaShengShallow();
        try {
            QiTianDaShengShallow clone =(QiTianDaShengShallow)shallow.clone();
            System.out.println("浅克隆："+(shallow.jinguBang==clone.jinguBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //深克隆
        QiTianDaShengDeep deep = new QiTianDaShengDeep();
        try {
            QiTianDaShengDeep clone =(QiTianDaShengDeep)deep.clone();
            System.out.println("深克隆："+(deep.jinguBang==clone.jinguBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
