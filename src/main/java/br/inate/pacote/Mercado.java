package br.inate.pacote;

import br.inate.pacote.Funções;

public class Mercado implements Funções {
    Produto[] produtos = new Produto[30];
    Arquivo arq = new Arquivo();
    float carrinho;
    @Override
    public void addproduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                arq.inserir(produto);
                break;
            }
        }
    }

    Produto prod = new Produto();

    @Override
    public void calcpreço() {
        int somatotcarne = 0;
        int somatotbiscoito = 0;
        int somatotsuco = 0;

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
        System.out.println("o preço total foi de: "+carrinho);
    }

    public float botaropreço() {
    return carrinho;
    }
}
