package exericicios.catalagolivros;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {

    private List<Livro> books;

    public CatalogoLivros() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String writer, int year) {
        books.add(new Livro(title, writer, year));
    }

    public List<Livro> findByWriter(String writer) {
        return books.stream()
                .filter(x -> x.getWriter().equalsIgnoreCase(writer))
                .toList();
    }

    public List<Livro> findByYearRange(int initialYear, int finalYear) {
        return books.stream()
                .filter(x -> (x.getYear() >= initialYear && x.getYear() <= finalYear))
                .toList();
    }

    public Optional<Livro> findByTitle(String title) {
        return books.stream()
            .filter(x -> x.getTitle().equalsIgnoreCase(title))
            .findFirst();
    }
}
