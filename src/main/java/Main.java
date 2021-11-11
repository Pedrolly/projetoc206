import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mercado mercado = new Mercado();
        int num;
        System.out.println("entre com a opção que deseja: 1- adicionar um produto,2-mostrar o total dos produtos,");
        num = teclado.nextInt();
        menu:
        while (num != -1) {
            switch (num) {
                case 1:
                    Produto prodaux = new Produto();
                    teclado.nextLine();
                    System.out.println("entre com o nome do produto");
                         prodaux.setNome(teclado.nextLine());
                    System.out.println("Entre com a quantidade do produto");
                    prodaux.setQuanidade(teclado.nextInt());
                     mercado.addproduto(prodaux);
                    break;
                case 2:

            }
            System.out.println("Deseja entrar com alguma outra opção? Digite ' -1 ' caso não queira entrar com mais nenhum produto");
            num = teclado.nextInt();
        }
    }
}