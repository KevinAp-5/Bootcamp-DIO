package exericicios.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public boolean removerTarefa(String descricao) {
        return this.tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        return tarefas.stream()
            .map(Tarefa::getDescricao)
            .toList();
    }
}
