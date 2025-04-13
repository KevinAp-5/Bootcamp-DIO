package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazy singleton1 = SingletonLazy.getInstance();
        System.out.println(singleton1);

        SingletonEager singleton2 = SingletonEager.getInstance();
        System.out.println(singleton2);

        SingletonLazyHolder singleton3 = SingletonLazyHolder.getInstance();
        System.out.println(singleton3);
        SingletonLazyHolder singleton4 = SingletonLazyHolder.getInstance();
        System.out.println(singleton4);
    }
}
