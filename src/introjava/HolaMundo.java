/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
package introjava;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el numero1 y numero2");
        numero1 = valor.nextInt();
        numero2 = valor.nextInt();
        boolean  bandera = false;
        while (!bandera) {
            System.out.println("Menú");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Opcion");
            int opcion = valor.nextInt();
            switch (opcion) {
                case 1:
                       int suma = numero1 + numero2;
                       System.out.println("La suma es" + suma);
                       break;
                case 2:
                       int resta = numero1 - numero2;
                       System.out.println("La resta es" + resta);
                       break;
                case 3:
                       int multiplicacion = numero1 * numero2;
                       System.out.println("La multiplacion es" + multiplicacion);
                       break;
                    
                case 4:
                       double division = ( double) numero1 / numero2;
                       System.out.println("La division es" + division);
                       System.out.println("numero1" + numero1);
                       break;
                case 5:
                       System.out.println("Seguro quiere salir? S/N");
                       char salir = valor.next().charAt(0);
                       
                       
                       if (salir == 'S'|| salir == 's') {
                        bandera = true;
                                
                    }
                       else {
                           bandera = false;
                       }

                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
    }

}
