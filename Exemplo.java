import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Olá git e github!!!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = entrada.nextInt();

        System.out.print("Digite um outro valor:");
        int valor2 = entrada.nextInt();

        int soma = valor1 + valor2;

        System.out.println("Resultado: " + soma);

        entrada.close();        
    }
}
