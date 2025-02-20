package entities;

public non-sealed class IngressoMeia extends Ingresso {

    public IngressoMeia(double valor) {
        super(valor);
    }

    @Override
    public double valorIngresso() {
        return this.valor / 2;
    }
}
