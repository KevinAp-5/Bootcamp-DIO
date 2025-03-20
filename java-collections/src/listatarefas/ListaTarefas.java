package listatarefas;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private Set<Tarefa> tasks;

    public ListaTarefas() {
        this.tasks = new HashSet<>();
    }

    public boolean addTask(String description) {
        return tasks.add(new Tarefa(description, false));
    }

    public boolean removeTask(String description) {
        return tasks.removeIf(x -> x.getDescription().equalsIgnoreCase(description));
    }

    public void showTasks() {
        tasks.forEach(System.out::println);
    }

    public int tasksAmount() {
        return tasks.size();
    }

    public Set<Tarefa> completedTasks() {
        return tasks.stream()
                .filter(Tarefa::isCompleted)
                .collect(Collectors.toSet());
    }

    public Set<Tarefa> uncompletedTasks() {
        return tasks.stream()
                .filter(x -> Boolean.FALSE.equals(x.isCompleted()))
                .collect(Collectors.toSet());
    }

    public void setTaskCompleted(String description) {
        tasks.removeIf(x -> x.getDescription().equalsIgnoreCase(description));
        tasks.add(new Tarefa(description, true));
    }

    public void setTaskUncompleted(String descricao) {
        tasks.removeIf(x -> x.getDescription().equalsIgnoreCase(descricao));
        tasks.add(new Tarefa(descricao, false));
    }

    public void removeAllTasks() {
        tasks.clear();
    }
}
