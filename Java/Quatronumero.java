import java.util.Scanner;

public class Quatronumero { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2° número: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o 3° número: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite o 4° número: ");
        double n4 = sc.nextDouble();
        double q1 = n1 * n1;
        double q2 = n2 * n2;
        double q3 = n3 * n3;
        double q4 = n4 * n4;
        double resultado = q1 + q2 + q3 + q4;
        System.out.println("O resultado é: " + resultado);
        sc.close();

    }
}