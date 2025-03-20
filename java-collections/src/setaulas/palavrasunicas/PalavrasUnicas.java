package setaulas.palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {
    private Set<String> words;

    public PalavrasUnicas() {
        this.words = new HashSet<>();
    }

    public boolean addWord(String word) {
        return words.add(word);
    }

    public boolean removeWord(String word) {
        return words.removeIf(x -> x.equalsIgnoreCase(word));
    }

    public boolean wordIsPresent(String word) {
        return words.contains(word);
    }

    public void showUniqueWords() {
        words.forEach(System.out::println);
    }
}
