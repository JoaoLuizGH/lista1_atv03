import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça dois números e imprima a soma.

        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Informe o primeiro número: ");
        numero1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = teclado.nextInt();

        soma = numero1 + numero2;

        teclado.close();

        System.out.println("O resultado da soma foi: " + soma);


    }
}
