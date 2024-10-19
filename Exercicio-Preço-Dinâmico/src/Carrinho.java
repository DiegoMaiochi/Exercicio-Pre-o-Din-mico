import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPrecoProduto());
        }
        return total;
    }
}
