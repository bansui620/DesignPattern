package springUsed.lazySingleton;

/**
 * 这种方式下，每次执行getInstance方法都会进行线程同步。
 * 若线程数量较多，则CPU分配压力就会大大上升，导致大批线程阻塞，性能就会大幅下降！
 */
public class LazySynchronized {
    private LazySynchronized(){}

    private static LazySynchronized lazy = null;
    public synchronized static LazySynchronized getInstance(){
        if (lazy==null){
            lazy = new LazySynchronized();
        }
        return lazy;
    }
}
