package br.inate.pacote;

public class Produto {
    private int quanidade;
    private int tipo;
    private float preço;
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getPreço() {
        return preço;
    }
    public void setPreço(float preço) {
        this.preço = preço;
    }

    public int getQuanidade() {
        return quanidade;
    }

    public void setQuanidade(int quanidade) {
        this.quanidade = quanidade;
    }
}
