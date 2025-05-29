package Operadores;

import java.util.Scanner;

public class AtribuicaoLogico {
    public static void main(String[] args) {

        //verificando se o usuario acertou
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2 ? ");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", isRight);


        //verificando a idade para dirigir
        System.out.println("Qualn é a sua idade? ");
        var age = scanner.nextInt();

        System.out.println("Você é amancipado? ");
        var IsEmancipated = scanner.nextBoolean();

        boolean canDrive = age >= 18 || (IsEmancipated && age >= 16); // Temos o | burro(ele mesmo se a 1° condição for verdadeira, ele irá querer saber a segunda.) e o || inteligente. O & (burro) e o && (intelige te tambem)
        System.out.printf("Você pode dirigir? (%s)", canDrive);

        //Mini tabela verdade
        System.out.printf("true && true = %s\n", true && true);
        System.out.printf("false && false = %s\n", false && false);
        System.out.printf("true && false = %s\n", true && false);
        System.out.printf("false && true = %s\n", false && true);
        System.out.println("======================================");
        System.out.printf("true || true = %s\n", true || true);
        System.out.printf("false || false = %s\n", false || false);
        System.out.printf("true || false = %s\n", true || true);
        System.out.printf("false || true = %s\n", false && true);

        System.out.printf("!true = %s", !true);
        System.out.printf("!false = %s", !false);

    }
}
