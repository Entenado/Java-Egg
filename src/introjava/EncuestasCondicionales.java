package introjava;

import java.util.Scanner;

public class EncuestasCondicionales {

    public static void main(String[] args) {

        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        System.out.println("Ingrese el limite");

        Scanner leer = new Scanner(System.in);
        int limite, suma, numero;
        limite = leer.nextInt();
        suma = 0;

        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            suma = suma + numero;

        } while (suma < limite);
        System.out.println("La suma es: " + suma);
    }
}

/* int opinion;
        
        scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        if (opinion >= 1 && opinion <=5) {
            switch(opinion){
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados de que no te haya gustado");
                    break;
                case 3:
                    System.out.println("has clasificado a la pelii como buena");
                    break;
                case 4:
                    System.out.println ("has clasificado a la pelii como muy buena");
                    break;
                case 5:
                     System.out.println ("has clasificado a la pelii como excelente");
                     break;
                    
                    
            }
        }else
    }
    
}*/
