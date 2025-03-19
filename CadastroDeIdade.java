import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroDeIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            if (idade <= 0) {
                System.out.println("A idade deve ser maior que 0 (Zero)");
                
            }else{
                System.out.println("Idade cadastrada com sucesso: "+ idade);

            }

        } catch (InputMismatchException e) {
            System.out.println("Digite um valor inteiro!");

        }
        

    }
}