package br.inate.pacote;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void inserir(Produto p) {
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;
        try {

            op = new FileOutputStream("lista-de-compras.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);


            bw.write("-------------Produto-------------\n");
            if (p.getTipo() == 1) {
                bw.write("produto pedido: Carne\n");
            }
            if (p.getTipo() == 2) {
               bw.write("produto pedido: Biscoito(s)\n");
            }
            if (p.getTipo() == 3) {
                bw.write("produto pedido: Suco(s)\n");
            }
            //mudar aqui
            if (p.getTipo() == 1) {
                bw.write("quantidade de produtos " + p.getQuanidade() + " gramas"+"\n");
            }
            if (p.getTipo() == 2) {
                bw.write("quantidade de produtos " + p.getQuanidade() +" unidades"+"\n");
            }
            if (p.getTipo() == 3) {
                bw.write("quantidade de produtos " + p.getQuanidade() +" Caixas"+ "\n");
            }




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

    public void inserirc(Cliente c) {
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;
        Mercado mercado = new Mercado();
        try {

            op = new FileOutputStream("lista-de-compras.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);

            bw.write("--------usuario--------\n");
            bw.write("nome: " + c.getNome() + "\n");
            bw.write("cpf: " + c.getCpf() + "\n");
            bw.write("Endereço: " + c.getEndereco() + "\n");

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
            is = new FileInputStream("lista-de-compras.txt");
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
            if (produtos.get(i).getTipo() == 1) {
                System.out.println("produto pedido: Carne");
            }
            if (produtos.get(i).getTipo() == 2) {
                System.out.println("produto pedido: Biscoito(s)");
            }
            if (produtos.get(i).getTipo() == 3) {
                System.out.println("produto pedido: Suco(s)");
            }
        }
        return produtos;
    }

    public void inserirm(Mercado m) {
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;
        Mercado mercado = new Mercado();
        try {

            op = new FileOutputStream("lista-de-compras.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);

            bw.write("--------Preço total--------\n");
            bw.write("preço total: " + m.carrinho +" R$" +"\n");


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
}