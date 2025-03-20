

public class Box<T> {
    private T type;

    public T getType() {
        return this.type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public Box(T type) {
        this.type = type;
    }
}
