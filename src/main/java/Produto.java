
public class Produto implements Mercado{
    String nome;
    float preco;
    int quantidade;

    public void addproduto(Produto p){
        if (p != null) {
            p.nome = this.nome;
            p.quantidade = this.quantidade;
            p.preco = this.preco;
        }
    }

    @Override
    public void precotot() {
        Mercado.super.precotot();

    }
}