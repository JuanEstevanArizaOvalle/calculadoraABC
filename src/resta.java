import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class resta {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int resta =0, op,n=0;
        int i=0;
        System.out.println("cuantos numeros desea restar");
        op = entrada.nextInt();
        for( i = 0 ; i < op; i++) {
            System.out.println("porfavor ingrese el numero" + i );
            n = entrada.nextInt();
            resta = resta - n;}
            System.out.println("señor usuario su resultado es: " + resta);


        }}
