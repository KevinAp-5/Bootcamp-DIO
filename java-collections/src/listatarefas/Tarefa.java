package listatarefas;

public class Tarefa {
    private String description;
    private boolean isCompleted;

    @Override
    public String toString() {
        return "Tarefa [description=" + description + ", isCompleted=" + isCompleted + "]";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Tarefa(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

}
