package products;

import java.util.ArrayList;
import java.util.List;

public class Processador implements Produto {

    private String nome;
    private List<Produto> componentes = new ArrayList<>();
    private double preco;

    public Processador(String nome, double preco) {
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
