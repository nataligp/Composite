package products;

import products.Produto;

public class Mouse implements Produto {
    private String nome;
    private double preco;

    public Mouse(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + ", Preço: " + preco);
    }

    @Override
    public void addComp(Produto produto) {
       
    }
}