package entities;

public non-sealed class SalesMan extends Employee {
    private double percentPerSold;
    private double fullSalary;

    public double getFullSalary() {
        return fullSalary;
    }

    public void setFullSalary(double soldAmount) {
        this.fullSalary = soldAmount;
    }

    protected SalesMan(double percentPerSold, double soldAmount, String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
    }

    public SalesMan() {
        super();
    }


    @Override
    public String getCode() {
        return this.getCode();
    }
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

}
