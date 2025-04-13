package singleton;

/**
 * SingletonLazy is a singleton class that uses lazy initialization.
 * It ensures that only one instance of the class is created when it is needed.
 * @Author Keven de Moraes
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (instance == null) {
            return new SingletonLazy();
        }
        return instance;
    }
}
