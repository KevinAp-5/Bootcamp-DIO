package setaulas.agendatelefonica;

public class Contato {
    private String name;
    private int number;

    @Override
    public String toString() {
        return "Contato [name=" + name + ", number=" + number + "]";
    }

    public Contato(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
