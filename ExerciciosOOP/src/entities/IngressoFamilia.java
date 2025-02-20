package entities;

public non-sealed class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    public IngressoFamilia(int quantidadePessoas, double valor) {
        super(valor);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double valorIngresso() {
        int porcentagemDesconto = 0;
        if (quantidadePessoas > 3) {
            porcentagemDesconto = 5;
        }

        return this.valor - ((this.valor * porcentagemDesconto) / 100);
    }

}
