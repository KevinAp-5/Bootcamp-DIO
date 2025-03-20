package exericicios.catalagolivros;

public class Livro {
    private String title;
    private String writer;
    private int year;

    @Override
    public String toString() {
        return "Livro [title=" + title + ", writer=" + writer + ", year=" + year + "]";
    }

    public Livro(String title, String writer, int year) {
        this.title = title;
        this.writer = writer;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


}
