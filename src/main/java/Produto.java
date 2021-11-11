
public class Produto implements Mercado{
    private String nome;
    private float preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

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