import entities.Employee;
import entities.Manager;
import entities.SalesMan;

public class App {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        SalesMan salesMan = new SalesMan();
        printEmployee(new Manager());
        // printEmployee(salesMan);

    }

    public static void printEmployee(Employee employee) {
        employee.setName("keven");

        if (employee instanceof Manager manager) {
            manager.setLogin("keven");
            manager.setPassword("12313131");

            System.out.println(employee.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());

        }

    }
}
