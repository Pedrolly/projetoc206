
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

    @Override
    public void calcpreço() {
        int somatotcarne = 0;
        int somatotbiscoito = 0;
        int somatotsuco = 0;
        int carrinho;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getTipo() == 1) {
                somatotcarne = produtos[i].getQuanidade() * 5;
            }
            if (produtos[i] != null && produtos[i].getTipo() == 2) {
                somatotbiscoito = produtos[i].getQuanidade() * 4;
            }
            if (produtos[i] != null && produtos[i].getTipo() == 3) {
                somatotsuco = produtos[i].getQuanidade() * 6;
            }
        }
        carrinho = somatotbiscoito + somatotcarne + somatotsuco;
        System.out.println(" A sua compa vai dar o valor de: "+ carrinho);
    }
}
