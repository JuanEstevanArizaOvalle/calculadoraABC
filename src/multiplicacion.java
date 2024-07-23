import java.util.Scanner;

public class multiplicacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int multiplicacion = 0, op, n = 0;
        int i = 0;
        System.out.println("cuantos numeros deseas multiplicar");
        op = entrada.nextInt();
        for (i = 0; i < op; i++) {
            System.out.println("Por favor ingresa el numero" + i);
            n = entrada.nextInt();
            multiplicacion = multiplicacion * n;
            System.out.println("Señor usuario el resultado de su multplicacion es :" + multiplicacion);

        }
    }
}
