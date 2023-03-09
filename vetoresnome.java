import java.util.Scanner;

public class vetoresnome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo: ");
        String nm = sc.next();
        String so = sc.nextLine();
        System.out.println("Quantas letras tem o seu primeiro nome? ");
        int le = sc.nextInt();

        for (int x = 0; x <= le -1; x++) {
            System.out.println(nm.charAt(x));
        }
        for (int x = 0; x <= 0; x++){
            System.out.println(so);
        }
    }
}
