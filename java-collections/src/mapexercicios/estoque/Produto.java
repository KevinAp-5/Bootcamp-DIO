package mapexercicios.estoque;

public class Produto {
    private String name;
    private double valor;
    private int quantidade;

    @Override
    public String toString() {
        return "Produto [name=" + name + ", valor=" + valor + ", quantidade=" + quantidade + "]";
    }

    public Produto(String name, double valor, int quantidade) {
        this.name = name;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
