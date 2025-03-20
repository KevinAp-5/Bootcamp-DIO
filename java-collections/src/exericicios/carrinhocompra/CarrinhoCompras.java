package exericicios.carrinhocompra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> cart;

    public CarrinhoCompras() {
        this.cart = new ArrayList<>();
    }

    public void addItem(String name, BigDecimal price, int quantity) {
        cart.add(new Item(name, price, quantity));
    }

    public boolean removeItem(String name) {
        return cart.removeIf(x -> x.getName().equals(name));
    }

    public BigDecimal totalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        cart.forEach(x -> total.add(x.getPrice().multiply(new BigDecimal(x.getQuantity()))));
        return total;
    }

    public void showItems() {
        cart.forEach(System.out::println);
    }

}
