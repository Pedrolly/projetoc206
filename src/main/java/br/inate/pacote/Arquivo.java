package br.inate.pacote;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void inserir(Produto p) {
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;
        Mercado merc = new Mercado();
        try {

            //TRUE SALVA O ANTIGO NO ARQUIVO E ESCREVE EMBAIXO
            //FALSE APAGA O QUE TINHA NO ARQUIVO ANTES E ESCREVE O CONTEUDO NOVO
            op = new FileOutputStream("lista de compras.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);

            p.setPreço(merc.botaropreço());
            bw.write("-------------Produto-------------\n");
            bw.write("os tipos de produtos " + p.getTipo() + "\n");
            bw.write("quantidade de produtos " + p.getQuanidade() + "\n");
            bw.write("preço total da compra " + p.getPreço() + "\n");
            bw.write("-------------novo Produto-------------\n");


        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Produto> buscar() {
        InputStream is;
        InputStreamReader isr;
        BufferedReader br = null;
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            is = new FileInputStream("lista de compras.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);

                Produto paux = new Produto();
                if (linha.contains("-produto-")) {
                    paux.getTipo();
                    paux.getQuanidade();
                    produtos.add(paux);
                }
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("-----------------------------------------");
            System.out.println("quantidade " + produtos.get(i).getQuanidade());
            System.out.println("tipo " + produtos.get(i).getTipo());
            System.out.println("preço total " + produtos.get(i).getPreço());
        }
        return produtos;
    }
}