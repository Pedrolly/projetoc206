package br.inate.pacote;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mercado mercado = new Mercado();
        Cliente cliente = new Cliente();
        int num;
        System.out.println("entre com o seu nome");
        cliente.setNome(teclado.nextLine());
        System.out.println("entre com o seu CPF");
        cliente.setCpf(teclado.nextLine());
        System.out.println("entre com o seu endereço");
        cliente.setEndereco(teclado.nextLine());
        System.out.println("entre com o que deseja iniciar 1-adiciona um produto, 2- mkostra o carrinho");
        num = teclado.nextInt();
        menu:
        while (num != -1) {
            switch (num) {
                case 1:
                    Produto proaux = new Produto();
                    System.out.println("entre com a opção que deseja:1- Carne:10 g = 5R$,2-Bicoito:1 unidade = 4 R$, 3:Suco: 1 unidade = 6 R$");
                    proaux.setTipo(teclado.nextInt());
                    System.out.println("quantas unidades ou quantas gramas");
                    proaux.setQuanidade(teclado.nextInt());

                    mercado.addproduto(proaux);
                    break;
                case 2:
                    mercado.calcpreço();
            }
            System.out.println("entre com o que deseja iniciar 1-adiciona um produto, 2- mkostra o carrinho");
            System.out.println("Digite ' -1 ' caso não queira entrar com mais nenhum produto");
            num = teclado.nextInt();
        }
    }
}