package mapexercicios.estoque;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> products;

    public EstoqueProdutos() {
        this.products = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String name, double preco, int quantidade) {
        products.put(cod, new Produto(name, preco, quantidade));
    }

    public void exibirProdutos() {
        products.forEach((x, y) -> System.out.println("Código: " + x + ", Produto: " + y));
    }

    public double valorTotal() {
        return products.values().stream()
                .mapToDouble(Produto::finalPrice)
                .sum();
    }

    public Produto produtoMaisCaro() {
        return products.values().stream()
                .max(Comparator.comparingDouble(Produto::getValor))
                .orElse(null);
    }

    public Produto produtoMaisBarato() {
        return products.values().stream()
                .min(Comparator.comparingDouble(Produto::getValor))
                .orElse(null);
    }

    public Produto produtoMaiorQuantidadeValor() {
        return products.values().stream()
                .max(Comparator.comparingDouble(Produto::finalPrice))
                .orElse(null);
    }
}
