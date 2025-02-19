import java.util.Scanner;

import entities.Carro;

public class MainCarro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("O carro foi criado.");
        System.out.println();

        int userInput = 0;
        while (userInput != 8) {
            System.out.println("--------------------------");
            System.out.println("Digite uma opção para o carro");
            System.out.println("1) Ligar o carro");
            System.out.println("2) Desligar o carro");
            System.out.println("3) Acelerar");
            System.out.println("4) Diminuir velocidade");
            System.out.println("5) Virar o carro");
            System.out.println("6) verificar velocidade");
            System.out.println("7) Trocar de marcha");
            System.out.println("----------------------------");
            System.out.println();

            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    carro.ligarCarro();
                    break;
                case 2:
                    carro.desligarCarro();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.deminuirVelocidade();
                    break;
                case 5:
                    carro.virarCarro();
                    break;
                case 6:
                    carro.printarVelocidade();
                    break;
                case 7:
                    System.out.println("Digite 0 para diminuir a marcha, 1 para subir");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                default:
                    break;
            }
        }
    }
}
