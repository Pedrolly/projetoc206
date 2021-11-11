
public class Mercado implements Funções {
    Produto[] produtos = new Produto[30];

    @Override
    public void addproduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                break;
            }
        }
    }

}