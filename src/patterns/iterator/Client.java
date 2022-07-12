package patterns.iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Object> products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();

        System.out.println("正向遍历：");
        while (!iterator.isLast()){
            System.out.print(iterator.getNextItem()+",");
            iterator.next();
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("反向遍历：");
        while (!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem()+",");
            iterator.previous();
        }

    }
}
