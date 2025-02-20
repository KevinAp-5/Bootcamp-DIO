package entities;

public non-sealed class Vendedor extends Funcionario{
    private int quantidadeVendas;

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
            super(nome, email, senha, false);
            this.quantidadeVendas = quantidadeVendas;
        }

    public void realizarVenda() {
        this.quantidadeVendas ++;
        System.out.println("Uma nova venda foi realizada!");
        System.out.println("Quantidade atual de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Foram feitas " + this.quantidadeVendas + " vendas");
    }

}
