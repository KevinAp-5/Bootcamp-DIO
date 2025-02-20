package entities;

public non-sealed class Caixa extends Funcionario {

    private double valorCaixa;

    public Caixa(String nome, String email, String senha, double valorCaixa) {
        super(nome, email, senha, false);
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamentos(double valor) {
        System.out.println("Foi feito o recebimento de um pagamento.");
        System.out.printf("Venda no valor de R$%.2f", valorCaixa);
        this.valorCaixa = this.valorCaixa + valor;
    }

    public void fecharCaixa() {
        System.out.println("Foi feito o fechamento do caixa.");
        System.out.println("O caixa tinha o valor de R$" + valorCaixa);
    }

    public double getValorCaixa() {
        return this.valorCaixa;
    }
}
