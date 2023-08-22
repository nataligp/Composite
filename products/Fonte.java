package products;

import java.util.ArrayList;
import java.util.List;

public class Fonte implements Produto {
    private String nome;
    private List<Produto> componentes = new ArrayList<>();
    private double preco;

    public Fonte(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Fonte: " + nome);
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void addComp(Produto produto) {
        componentes.add(produto);
    }
}

