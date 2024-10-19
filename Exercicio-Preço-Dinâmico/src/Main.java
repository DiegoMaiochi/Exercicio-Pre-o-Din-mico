public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Tênis", 550.0);
        Produto produto2 = new Produto("Bermuda", 70.0);
        Produto produto3 = new Produto("Moleton", 120.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para um novo cliente é: R$ " + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para um cliente regular é: R$" + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Total para cliente vip é: " + carrinho.calcularTotal());
    }
}