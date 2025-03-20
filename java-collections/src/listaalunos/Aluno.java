package listaalunos;

public class Aluno {

    private String name;
    private long registration;
    private double average;

    @Override
    public String toString() {
        return "Aluno [name=" + name + ", registration=" + registration + ", average=" + average + "]";
    }

    public Aluno(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getRegistration() {
        return registration;
    }
    public void setRegistration(long registration) {
        this.registration = registration;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }

}
