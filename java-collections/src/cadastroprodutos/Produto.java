package cadastroprodutos;

import java.math.BigDecimal;

public class Produto {
    private String name;
    private int code;
    private BigDecimal price;
    private int quantity;

    @Override
    public String toString() {
        return "Produto [name=" + name + ", code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public Produto(String name, int code, BigDecimal price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
