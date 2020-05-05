
package ejercicio2arreglo;

import java.util.Scanner;


public class Programa {
    

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Cliente [] c;
          
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();
        
        c = new Cliente[cantClientes];
        
        for (int i = 0; i < c.length; i++) {
            sc.nextLine();
            System.out.println("Ingrese el codigo del cliente " + (i + 1));
            int numeroCliente = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente " + (i + 1));
            String nombreCliente = sc.nextLine();
            System.out.println("Ingrese la antiguedad del cliente " + (i + 1));
            int antiguedad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota " + (i + 1));
            String nombreMascota = sc.nextLine();
            System.out.println("Ingrese la edad de la mascota " + (i + 1));
            int edadMascota = sc.nextInt();
            
            c[i]= new Cliente(numeroCliente, nombreCliente, antiguedad, nombreMascota, edadMascota);
        }
        
        System.out.println("La cantidad de clientes es: " + cantClientes);
        
        int acumuladorEdad = 0;
        int contadorMascotas = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]!= null){
                acumuladorEdad += c[i].getEdadMascota();
                contadorMascotas ++;
            }
        }
        System.out.println("El promedio de edad de las Mascotas es de: " +acumuladorEdad/contadorMascotas);
        
        
        int ClientesMas5 = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]!= null && c[i].getAntiguedadCliente() >= 5){
                ClientesMas5 ++;
            }
        }
        System.out.println("La cantidad de clientes con antigüedad mayor igual a 5 años es de: " + ClientesMas5);
    }
    
}
