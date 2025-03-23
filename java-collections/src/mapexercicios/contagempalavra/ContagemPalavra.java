package mapexercicios.contagempalavra;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> palavras;

    public ContagemPalavra() {
        this.palavras = new HashMap<>();
    }


    public void addPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removePalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void showPalavras() {
        palavras.forEach((a, b) -> System.out.println("Palavra: " + a + ", Contagem: " + b));
    }

    public String frequentPalavra() {
        return palavras.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey) 
                .orElse(null);
    }
}
