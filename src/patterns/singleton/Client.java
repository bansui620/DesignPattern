package patterns.singleton;

public class Client {

    public static void main(String[] args) {
        Visitor v1,v2;
        v1 = Visitor.getVisitor();
        v2 = Visitor.getVisitor();
        int n = v2.getNumber();
        System.out.println("总的访问人数是："+n);
    }


}
