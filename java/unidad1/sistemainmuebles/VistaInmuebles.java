package java.unidad1.sistemainmuebles;

import java.util.*;
public class VistaInmuebles {
    ControladorInmuebles controlador;
    GestorInmuebles gestor;
    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu(){
        int opcion=0;
        do {
        System.out.println("- - - Bienvenido al Sistema de Inmuebles - - -");
        System.out.println("1- Cargar Inmueble ");
        System.out.println("2- Borrar Inmueble (Ultimo ingresado) ");
        System.out.println("3- Borrar Inmueble por ID ");
        System.out.println("4- Mostrar Inmueble ");
        System.out.println("5- Mostrar Inmueble (Filtrados) ");
        System.out.println("6- Buscar Inmueble ");
        System.out.println("7- Cargar a Archivo los Inmueble ");
        System.out.println("8- Recuperar de Archivo los Inmueble ");
        System.out.println("9- Mostrar Inmueble en Archivo ");
        System.out.println("0 - Salir");
        System.out.print("Seleccione una Opcion: ");
        opcion=scanner.nextInt();
        } while (opcion!=0);
        switch (opcion) {
            case 1:
                int opinmueble;
                System.out.println("- - - Seleccione el tipo de inmueble a cargar - - -");
                System.out.println("1- Casa ");
                System.out.println("2- Departamento ");
                opinmueble=scanner.nextInt();
                controlador.crearInmueble(opinmueble);
                break;
            case 2:
                controlador.borrarInmuebleReciente();
                System.out.println("- - - Se elimino el mueble mas reciente! - - -");
                break;
            case 3:
                int idbusqueda;
                System.out.println("- - - Borrar Inmueble por ID - - -");
                System.out.print("Ingrese el ID del inmueble: ");
                idbusqueda=scanner.nextInt();
                controlador.borrarInmuebleID(idbusqueda);
                break;
            case 4:
                System.out.println("- - - Lista de Inmuebles - - -");
                gestor.mostrarInmuebles();
            default:
                break;
        }
    }
}
