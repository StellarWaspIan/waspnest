package java.unidad1.sistemainmuebles;

import java.util.*;
public class VistaInmuebles {
    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu(){
        int opcion=0;
        do {
        System.out.println("- - - Bienvenido al Sistema de Inmuebles - - -");
        System.out.println("1- Cargar Inmueble ");
        System.out.println("2- Borrar Inmueble ");
        System.out.println("3- Mostrar Inmueble ");
        System.out.println("4- Mostrar Inmueble (Filtrados) ");
        System.out.println("5- Buscar Inmueble ");
        System.out.println("6- Cargar a Archivo los Inmueble ");
        System.out.println("7- Recuperar de Archivo los Inmueble ");
        System.out.println("8- Mostrar Inmueble en Archivo ");
        System.out.println("0 - Salir");
        System.out.print("Seleccione una Opcion: ");
        opcion=scanner.nextInt();
        } while (opcion!=0);
        switch (opcion) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
