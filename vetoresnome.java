import java.util.Scanner;

public class vetoresnome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo: ");
        String nome = sc.next();
        String sobrenome = sc.nextLine();
        int tamanhoNome = nome.length();

        for (int x = 0; x <= tamanhoNome -1; x++) {
            System.out.println(nome.charAt(x));
        }
        for (int x = 0; x <= 0; x++){
            System.out.println(sobrenome);
        }
    }
}
