package springUsed.lazySingleton;

public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;
    public static LazySimpleSingleton getInstance(){
        if (lazy==null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
