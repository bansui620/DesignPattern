package patterns.iterator;

import java.util.List;

public class ProductList extends AbstractObjectList{

    public ProductList(List products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}

