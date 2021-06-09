import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        int entrada;
        int calculo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        entrada = teclado.nextInt();
        System.out.println("El numero inical es: "+entrada);
        if (entrada%2==0) {
            calculo = (entrada / 2);
            System.out.printf(String.valueOf(calculo));
        } else {
            calculo = ((entrada * 3) + 1);
            System.out.printf(String.valueOf(calculo));
        }
    }
}