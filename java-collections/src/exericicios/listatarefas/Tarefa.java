package exericicios.listatarefas;

public class Tarefa {

    private String descricao;

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
