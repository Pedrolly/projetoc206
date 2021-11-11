import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produtos = new Produto();
        int i;
        System.out.println("entre com a quantidade de produtos que deseja comprar");
        i = teclado.nextInt();

        do {
            Produto prodaux = new Produto();
            System.out.println("entre com o nome do produto");
            prodaux.setNome(teclado.nextLine());
            System.out.println("Entre com a quantidade do produto");
            prodaux.setQuantidade(teclado.nextInt());
            produtos.addproduto(prodaux);
            System.out.println("Deseja entrar com alguma outra opção? Digite ' -1 ' caso não queira entrar com mais nenhum produto");
            i=teclado.nextInt();

        }while (i != -1);

    }
}