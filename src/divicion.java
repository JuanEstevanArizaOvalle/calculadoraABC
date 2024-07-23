import java.util.Scanner;

public class divicion {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        float divicion;
        System.out.println("porfavor ingrese el numero 1");
        int n1 = entrada.nextInt();
        System.out.println("porfavor ingrese el numero 2");
        int n2 = entrada.nextInt();
        divicion = n1 / n2;
        System.out.println("señor usuario su resultado es: " + divicion);



    }
}
