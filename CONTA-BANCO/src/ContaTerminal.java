
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo = BigDecimal.ZERO;


    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public ContaTerminal(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        deposito(saldo);
    }

    public boolean deposito(BigDecimal saldoDeposito) {
        if (saldoDeposito.doubleValue() <= 0 ) {
            return false;
        }

        this.saldo = this.saldo.add(saldoDeposito);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diigte seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agencia");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o saldo para fazer um deposíto: ");
        double saldoDeposito = scanner.nextDouble();

        System.out.println(saldoDeposito);
        BigDecimal saldoDepositoBigDecimal = BigDecimal.valueOf(saldoDeposito);
        System.out.println(saldoDeposito);
        ContaTerminal conta = new ContaTerminal(numeroConta, numeroAgencia, nome, saldoDepositoBigDecimal);
        
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está dispnível para saque%n", conta.nomeCliente, conta.agencia, conta.numero, conta.saldo.doubleValue());
        scanner.close();
    }
}
