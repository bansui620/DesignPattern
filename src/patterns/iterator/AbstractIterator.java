package patterns.iterator;

public interface AbstractIterator {

    void next();
    boolean isLast();
    boolean isFirst();
    void previous();
    Object getNextItem();
    Object getPreviousItem();
}
