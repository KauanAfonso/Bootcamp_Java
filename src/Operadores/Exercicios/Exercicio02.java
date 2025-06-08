package Operadores.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho  do lado de um quadrado: ");
        int lado_quadrado = scanner.nextInt();
        int area = lado_quadrado * lado_quadrado;
        System.out.printf("A area do quadrado e de %s", area);
    }
}
