import java.util.Scanner;

public class ConversorOctalDecimal {
    private static int octalToDecimal(int octal) {
        if (octal < 0) {
            throw new IllegalArgumentException("ATENÇÃO: Valor de entrada não pode ser negativo!");
        }
        if (octal == 0) {
            return 0;
        }
        return (octal % 10) + 8 * octalToDecimal(octal / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor em octal: ");
        int valorOctal = sc.nextInt();
        sc.close();
        int valorDecimal = octalToDecimal(valorOctal);
        System.out.println("O valor " + valorOctal + " em decimal é " + valorDecimal);
    }
}

