package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        objects.add(obj);
    }

    public void removeObject(Object obj) {
        objects.remove(obj);
    }

    public List getObjects() {
        return objects;
    }

    public abstract AbstractIterator createIterator();

}

