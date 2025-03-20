package cadastroprodutos;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class CadastroProdutos {

    private Set<Produto> products;

    public CadastroProdutos() {
        this.products = new LinkedHashSet<>();
    }

    public boolean addProduct(String name, int code, BigDecimal price, int quantity) {
        return this.products.add(new Produto(name, code, price, quantity));
    }

    public void printProductsByName() {
        var listProducts = this.products.stream().toList();
        listProducts.sort(new ComparatorName());
        listProducts.forEach(System.out::println);
    }

    public void printProductsByPrice() {
        var listProducts = this.products.stream().toList();
        listProducts.sort(new ComparatorPrice());
        listProducts.forEach(System.out::println);
    }
}
