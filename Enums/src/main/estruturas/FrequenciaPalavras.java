package main.estruturas;

import java.util.HashMap;
import java.util.Map;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        String palavra = "Java é muito legal Java é bacana";
        String[] palavras = palavra.split(" ");

        Map<String, Integer> contagemPalavras = new HashMap<>();
        for (String palavraDaLista: palavras) {
            contagemPalavras.put(palavraDaLista, contagemPalavras.getOrDefault(palavraDaLista, 0) + 1);
        }

        System.out.println(contagemPalavras);
        System.out.println("Palavras repetidas: ");
        for (Map.Entry<String, Integer> entry: contagemPalavras.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("A palavra: '%s' repetiu %d vezes%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
