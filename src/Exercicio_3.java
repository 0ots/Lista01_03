import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) throws Exception {

        double numero1, numero2, soma;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        numero1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");

        numero2 = input.nextDouble();

        input.close();

        soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

    }
    
}
