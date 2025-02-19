package entities;

import java.math.BigDecimal;

public class ContaBancaria {
    private BigDecimal saldo;
    private BigDecimal chequeEspecial;
    private BigDecimal limiteChequeEspecial;
    private boolean usandoChequeEspecial;
    private BigDecimal taxaUsoCheque;

    public ContaBancaria(double depositoInicial) {
        this.criarSaldos(depositoInicial);
        this.deposito(depositoInicial);
    }

    public boolean deposito(double valorDeposito) {
        if (valorDeposito < 0) {
            return false;
        }

        BigDecimal valorDepositar = BigDecimal.valueOf(valorDeposito);

        if (!usandoChequeEspecial) {
            saldo = saldo.add(valorDepositar);
            return true;
        }

        BigDecimal diferencaChequeEspecial = limiteChequeEspecial.subtract(chequeEspecial);

        if (valorDepositar.compareTo(diferencaChequeEspecial) <= 0) {
            depositoChequeEspecial(valorDepositar);
            return true;
        }

        depositoChequeEspecial(diferencaChequeEspecial);
        BigDecimal restante = valorDepositar.subtract(diferencaChequeEspecial);
        saldo = saldo.add(restante);

        return true;
    }

    public Boolean saque(double valorSaque) {
        BigDecimal valorSaqueBigDecimal = BigDecimal.valueOf(valorSaque);

        if (valorSaqueBigDecimal.compareTo(saldo.add(chequeEspecial)) > 0) {
            return false;
        }

        if (valorSaqueBigDecimal.compareTo(saldo) > 0) {
            BigDecimal diferenca = valorSaqueBigDecimal.subtract(saldo);
            this.saldo = BigDecimal.ZERO;
            sacarChequeEspecial(diferenca);
            return true;
        }
        
        this.saldo = this.saldo.subtract(valorSaqueBigDecimal);
        this.usandoChequeEspecial = false;

        return true;
    }

    private void criarSaldos(double depositoInicial) {
        this.saldo = BigDecimal.ZERO;
        this.usandoChequeEspecial = false;
        this.taxaUsoCheque = BigDecimal.ZERO;
        if (depositoInicial < 500) {
            this.chequeEspecial = BigDecimal.valueOf(50.00);
            this.limiteChequeEspecial = this.chequeEspecial;
        } else {
            this.chequeEspecial = BigDecimal.valueOf(depositoInicial * 0.5);
            this.limiteChequeEspecial = this.chequeEspecial;
        }
    }

    public boolean chequeEspecialEmUso() {
        return this.usandoChequeEspecial;
    }
    public BigDecimal saldoChequeEspecial() {
        return this.chequeEspecial;
    }

    public BigDecimal saldoLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public BigDecimal saldo() {
        return this.saldo;
    }

    private void depositoChequeEspecial(BigDecimal valorDeposito) {
        this.chequeEspecial = this.chequeEspecial.add(valorDeposito);
        if (!taxaUsoCheque.equals(BigDecimal.ZERO)) {
            this.chequeEspecial = this.chequeEspecial.subtract(taxaUsoCheque);
            taxaUsoCheque = BigDecimal.ZERO;
        }
        this.usandoChequeEspecial = !this.chequeEspecial.equals(limiteChequeEspecial);
    }

    private void sacarChequeEspecial(BigDecimal valorSaque) {
        this.taxaUsoCheque = valorSaque.multiply(BigDecimal.valueOf(0.2));
        this.chequeEspecial = this.chequeEspecial.subtract(valorSaque);
        this.usandoChequeEspecial = true;
    }
}
