package mapexercicios.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dict;
    
    public Dicionario() {
        this.dict = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dict.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.dict.remove(palavra);
    }

    public void exibirPalavras() {
        this.dict.forEach((k, v) -> System.out.printf("Palavra: %s, Definição: %s%n", k, v));
    }

    public String pesquisarPalavra(String palavra) {
        return this.dict.get(palavra);
    }
}
