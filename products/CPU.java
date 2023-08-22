package products;

import java.util.ArrayList;
import java.util.List;

public class CPU implements Produto {

    private String nome;
    private List<Produto> componentes = new ArrayList<>();
    private double preco;
    private Produto produto;

    public CPU(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public CPU(Produto produto) {
        componentes.add(produto);
    }

    public double getPreco() {
        double precoTotal = 0;
        for (Produto produto : componentes) {
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Componentes: ");
        for (Produto produto : componentes) {
            produto.exibirInfo();
        }
        System.out.println("Valor: " + getPreco());
    }

    @Override
    public void addComp(Produto produto) {
        componentes.add(produto);
    }
}
