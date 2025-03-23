package mapexercicios.livraria;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Livraria {

    private Map<String, Livro> books;

    public Livraria() {
        this.books = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price) {
        this.books.put(link, new Livro(title, author, price));
    }

    public boolean removeByTitle(String title) {
        return this.books.values().removeIf(livro -> livro.getTitle().equalsIgnoreCase(title));
    }

    public void showBooksByAscendingPrice() {
        this.books.values().stream()
                .sorted()
                .toList()
                .forEach(System.out::println);
    }

    public List<Livro> booksByAuthor(String author) {
        return this.books.values().stream()
                .filter(livro -> livro.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public Livro mostExpensive() {
        return this.books.values().stream()
            .max(Comparator.comparingDouble(Livro::getPrice))
            .orElse(null);
    }

    public Livro mostCheap() {
        return this.books.values().stream()
            .min(Comparator.comparingDouble(Livro::getPrice))
            .orElse(null);
    }
}
