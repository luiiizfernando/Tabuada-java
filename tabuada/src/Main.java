import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número para calcular a tabuada: ");
        numero = leitura.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d X %d = %d\n", numero, i, numero*i);
        }
    }
}