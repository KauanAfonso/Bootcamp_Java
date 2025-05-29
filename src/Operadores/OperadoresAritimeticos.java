package Operadores;

import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", value1,value2, value1 + value2);
        System.out.printf("%s - %s = %s\n", value1,value2, value1 - value2);
        System.out.printf("%s * %s = %s\n", value1,value2, value1 * value2);
        System.out.printf("%s / %s = %s\n", value1,value2, value1 / value2);

        var numero = 15;
        numero+=40;
        System.out.println("Atibuição de mais 40 a 15 é: " + numero );

    }


}
