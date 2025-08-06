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
        System.out.println("4- Mostrar Inmuebles ");
        System.out.println("5- Buscar Inmueble por ID y Modificar ");
        System.out.println("6- Cargar a Archivo los Inmueble ");
        System.out.println("7- Recuperar de Archivo los Inmueble ");
        System.out.println("8- Mostrar Inmuebles en Archivo ");
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
                int idborrar;
                System.out.println("- - - Borrar Inmueble por ID - - -");
                System.out.print("Ingrese el ID del inmueble: ");
                idborrar=scanner.nextInt();
                controlador.borrarInmuebleID(idborrar);
                break;
            case 4:
                System.out.println("- - - Lista de Inmuebles - - -");
                gestor.mostrarInmuebles();
                break;
            case 5:
                int idbusqueda;
                System.out.println("- - - Buscar Inmueble - - -");
                System.out.print("Ingrese el ID del Inmueble: ");
                idbusqueda=scanner.nextInt();
                controlador.buscarInmuebleID(idbusqueda);
                break;
            case 6:
                System.out.println("Cargando Datos......");
                break;
            case 7:
                System.out.println("Recuperando Datos...");
                break;
            case 8:
                System.out.println("--- Inmuebles en Archivo Externo ---");
                break;
            case 0:
                System.out.println("Saliendo del Sistema....");
                break;
            default:
                System.out.println("Error, Seleccione una opcion valida!!!");
                break;
        }
    }
}
