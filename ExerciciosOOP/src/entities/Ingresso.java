package entities;

public abstract sealed class Ingresso permits IngressoMeia, IngressoFamilia {

    protected double valor;

    protected Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double valorIngresso();
}
