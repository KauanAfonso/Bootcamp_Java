package Operadores.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base de um retangulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite a altura de retangulo : ");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.printf("A area do retangulo e de %s", area);
    }
}
