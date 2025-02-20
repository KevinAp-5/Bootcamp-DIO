package entities;

public non-sealed class Manager extends Employee {

    public Manager() {
        super();
    }

    public Manager(
        String login, 
        String password,
        double comission,
        String code,
        String name,
        String address,
        int age,
        double salary
        ) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    private String login;
    private String password;
    private double comission;

    public double getFullSalary() {
        return this.getSalary();
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
