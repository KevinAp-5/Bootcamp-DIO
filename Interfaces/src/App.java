import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(new User("Maria", 21), new User("Jose", 21), new User("Fina", 21));
        users.forEach(System.out::println);

        printStringValues(User::getName, users);
    }

    private static void printStringValues(Function<User, String> callback, List<User> users) {
        users.forEach(x -> System.out.println(callback.apply(x)));
    }
}
