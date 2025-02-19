import java.util.Scanner;

import entities.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do deposito inicial: ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int userInput = 0;
        while (userInput != 7) {
            System.out.println("Digite uma opção");
            System.out.println("1) Consultar saldo");
            System.out.println("2) Consultar cheque especial");
            System.out.println("3) depositar dinheiro");
            System.out.println("4) Sacar dinheiro");
            System.out.println("5) Pagar um boleto");
            System.out.println("6) Cheque especial em uso");
            System.out.println("7) Sair");

            userInput = scanner.nextInt();
            System.out.println("-----------------------");
            switch (userInput) {
                case 1:
                    System.out.printf("Saldo disponível: %.2f%n", conta.saldo().doubleValue());
                    System.out.printf("Cheque especial disponível: %.2f%n", conta.saldoChequeEspecial().doubleValue());
                    break;
                case 2:
                    System.out.printf("Limite máximo do cheque especial: %.2f%n", conta.saldoLimiteChequeEspecial().doubleValue());
                    break;
                case 3:
                    System.out.println("Digite o valor do deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    boolean depositado = conta.deposito(valorDeposito);
                    if (!depositado) {
                        System.out.println("Não é possível depositar um valor negativo");
                        break;
                    }
                    System.out.println("Valor depositado com sucesso");
                    break;
                case 4:
                    System.out.println("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    boolean sacado = conta.saque(valorSaque);
                    if (!sacado) {
                        System.out.println("Não é possível sacar. Não há saldo + cheque especial disponível.");
                        break;
                    }
                    System.out.println("Valor sacado com sucesso.");
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto a pagar: ");
                    double valorBoleto = scanner.nextDouble();
                    boolean saqueBoleto = conta.saque(valorBoleto);
                    if (!saqueBoleto) {
                        System.out.println("Não saldo nem limite para pagar o boleto.");
                        break;
                    }
                    System.out.println("Boleto pago com sucesso.");
                    break;
                case 6:
                    boolean usandoChequeEspecial = conta.chequeEspecialEmUso();
                    if (usandoChequeEspecial) {
                        System.out.println("O cheque especial está em uso.");
                        break;
                    }
                    System.out.println("O cheque especial não está em uso");
                    break;
                default:
                    break;
            }
        }
    }
}
