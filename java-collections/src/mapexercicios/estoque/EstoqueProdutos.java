package mapexercicios.estoque;

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
        double valorTotal = 0;
    
        for (Map.Entry<Long, Produto> entry: products.entrySet()) {
            Produto produto = entry.getValue();
            valorTotal += produto.getValor() * produto.getQuantidade();
        }
    
        return valorTotal;
    }

    public Produto produtoMaisCaro() {
        double preco = 0;
        Produto produtoMaisCaro = null;
        for (Map.Entry<Long, Produto> entry: products.entrySet()) {
            if (entry.getValue().getValor() > preco) {
                preco = entry.getValue().getValor();
                produtoMaisCaro = entry.getValue();
            }
        }
        return produtoMaisCaro;
    }

    public Produto produtoMaisBarato() {
        double preco = Double.MAX_VALUE;
        Produto productToReturn = null;
        for (Map.Entry<Long, Produto> entry: products.entrySet()) {
            if (entry.getValue().getValor() < preco) {
                preco = entry.getValue().getValor();
                productToReturn = entry.getValue();
            }
        }
        return productToReturn;
    }

    public Produto produtoMaiorQuantidadeValor() {
        double precoTotal = 0;
        Produto produto = null;
        for (Map.Entry<Long, Produto> entry: products.entrySet()) {
            var produtoEntry = entry.getValue();
            var maxPreco = produtoEntry.getValor() * produtoEntry.getQuantidade();
            if (maxPreco > precoTotal) {
                precoTotal = maxPreco;
                produto = produtoEntry;
            }
        }
        return produto;
    }
}
