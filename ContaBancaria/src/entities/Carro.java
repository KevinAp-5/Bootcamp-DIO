package entities;

import java.util.HashMap;
import java.util.Map;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;
    private HashMap<Integer, Integer> limiteVelocidadePorMarcha;

    public Carro() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
        criarLimiteVelocidade();
    }

    private void criarLimiteVelocidade() {
        limiteVelocidadePorMarcha = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            limiteVelocidadePorMarcha.put(i, 20 * i);
        }
    }

    public void trocarMarcha(int valor) {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro.");
            return;
        }

        if (valor == 0 && marcha == 0) {
            System.out.println("O carro está no ponto morto, não tem como diminuir a marchar");
            return;
        }
        if (valor == 1 && marcha == 6) {
            System.out.println("O carro já está na 6a marcha, não tem como subir de marcha.");
            return;
        }
        if (valor == 0) {
            marcha = marcha - 1;
        } else {
            marcha = marcha + 1;
        }

        System.out.println("Marcha trocada para: " + marcha);

    }

    public void virarCarro() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando o carro!");
            return;
        }
        System.out.println("Velocidade inapropriada para virar o carro.");
    }

    public void printarVelocidade() {
        System.out.println("velocidade atual: " + velocidade + "Km/H");
        System.out.println("Marcha atual: " + marcha);
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro para acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("Tira o carro do ponto morto para poder acelerar");
            return;
        }

        if (velocidade == 120) {
            System.out.println("O carro já está na velocidade máxima");
            return;
        }

        for (Map.Entry<Integer, Integer> entry : limiteVelocidadePorMarcha.entrySet()) {
            if (velocidade == entry.getValue() && marcha == entry.getKey()) {
                System.out.printf("Passe o carro para %da marcha para ultrapassar a velocidade: %d%n", entry.getKey(),
                        velocidade);
                return;
            }
        }

        velocidade++;
        System.out.println("Carro acelerou.");
    }

    public void deminuirVelocidade() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro");
        }
        if (velocidade == 0) {
            System.out.println("O carro está parado, não tem como desacelerar.");
        }

        // velocidade = 21
        // marcha = 2
        for (Map.Entry<Integer, Integer> entry : limiteVelocidadePorMarcha.entrySet()) {
            int velocidadeDesejada = velocidade - 1;
            if (velocidadeDesejada == entry.getValue() && marcha != entry.getKey()) {
                System.out.printf("Passe a marcha para %da, para poder reduzir para %dKm/H%n", entry.getKey(),
                        velocidadeDesejada);
                return;
            }
        }
        velocidade--;
        System.out.println("Carro diminui a velocidade.");
    }

    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
            return;
        }
        System.out.println("O carro já está ligado.");
    }

    public void desligarCarro() {
        if (ligado) {
            if (velocidade != 0) {
                System.out.println("Diminua a velocidade para 0");
                return;
            }

            if (marcha != 0) {
                System.out.println("Coloque a marcha em ponto morto para desligar");
                return;
            }

            System.out.println("Carro foi desligado.");
            ligado = false;
            return;
        }

        System.out.println("O carro já está desligado");
    }

}
