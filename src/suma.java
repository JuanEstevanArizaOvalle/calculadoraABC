import java.util.Scanner;

public class suma {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        int suma = 0, op,n=0;
        int i = 0;
        System.out.println("cuantos numeros deseas sumar????????");
        op = entrada.nextInt();
        for (i = 0; i < op; i++) {
            System.out.println("ingresa el dato numero: "+i);
           n = entrada.nextInt();
           suma=suma+n;
        }
        System.out.println("la suna es: " + suma);
    }
}
