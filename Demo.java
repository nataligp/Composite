import products.CPU;
import products.HD;
import products.MemoriaRAM;
import products.Monitor;
import products.Mouse;
import products.PlacaMae;
import products.Produto;
import products.SSD;
import products.Teclado;

public class Demo {
    public static void main(String[] args) {
        Produto mouse = new Mouse("Mouse", 150.90);
        Produto teclado = new Teclado("Teclado", 180.90);
        Produto monitor = new Monitor("Monitor", 2559.90);
        Produto hd = new HD("HD", 4590.90);
        Produto ram = new MemoriaRAM("RAM", 300.90);
        Produto ssd = new SSD("SSD", 2080.90);
        Produto placaMae = new PlacaMae("Placa Mãe", 2790.90);
        Produto cpu = new CPU("CPU", 3490.90);

        LojaInformatica loja = new LojaInformatica();
        loja.adicionarProduto(mouse);
        loja.adicionarProduto(teclado);
        loja.adicionarProduto(monitor);
        loja.adicionarProduto(hd);
        loja.adicionarProduto(ram);
        loja.adicionarProduto(ssd);
        placaMae.addComp(ram);
        placaMae.addComp(ssd);
        loja.adicionarProduto(placaMae);
        cpu.addComp(placaMae);
        cpu.addComp(hd);
        loja.adicionarProduto(cpu);
        

        System.out.println("Produtos da Loja:");
        loja.exibirProdutos(mouse);
        loja.exibirProdutos(teclado);
        loja.exibirProdutos(monitor);
        loja.exibirProdutos(hd);
        loja.exibirProdutos(ram);
        loja.exibirProdutos(ssd);
        loja.exibirProdutos(cpu);
        
    }
}
