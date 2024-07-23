import java.util.Scanner;

public class multiplicacion {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        int multiplicacion;

        System.out.println("por favor ingrese el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("por favor ingrese el segundo numero");
        int num2 = entrada.nextInt();

        multiplicacion = num1*num2;

        System.out.println("Señor usuario el resultado de su multplicacion es :"  + multiplicacion);

    }
}
