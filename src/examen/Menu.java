package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una sala de cine que exhibe distintas películas, necesita que se implemente 
 * un sistema que permita registrar la entrada de sus películas.
 * 
 * @author Ivan Bustos - 12883762-0
 */
public class Menu {

    private static Scanner read = new Scanner(System.in);
    private static SalaDeCine salaDeCine = new SalaDeCine(); // Instancia de SalaDeCine

    public static void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("Bienvenido al menú de Cine");
            System.out.println("1.- Agregar Película");
            System.out.println("2.- Buscar Película");
            System.out.println("3.- Listar Películas");
            System.out.println("4.- Eliminar Películas");
            System.out.println("0.- Salir");

            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    agregarPelicula();
                    break;
                case 2:
                    buscarPelicula();
                    break;
                case 3:
                    listarPeliculas();
                    break;
                case 4:
                    eliminarPelicula();
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    private static int obtenerOpcion() {
        int opcion = -1;
        while (opcion < 0 || opcion > 4) {
            try {
                opcion = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entre 0 y 4.");
                read.next(); // Limpiar el buffer
            }
        }
        return opcion;
    }

    private static void agregarPelicula() {
        String titulo = obtenerTitulo();
        String genero = obtenerCadena("Ingrese género: ");
        String director = obtenerCadena("Ingrese director: ");
        String nombre = obtenerCadena("Ingrese nombre del actor principal: ");

        Pelicula pelicula = new Pelicula(titulo, genero, director, nombre); // Crear instancia de Pelicula
        salaDeCine.agregarPeliculaEstreno(pelicula);
        System.out.println("Película agregada con éxito");
    }

    private static String obtenerTitulo() {
        String titulo = obtenerCadena("Ingrese título (mínimo 6 caracteres): ");
        if (titulo.length() < 6) {
            titulo = String.format("%-6s", titulo).replace(' ', '_');
        } else {
            titulo = titulo.substring(0, 6);
        }
        return titulo;
    }

    private static String obtenerCadena(String mensaje) {
        System.out.println(mensaje);
        return read.next();
    }

    private static void buscarPelicula() {
        int codPelicula = obtenerCodigo("Ingrese código de película a buscar: ");
        Pelicula pelicula = salaDeCine.buscarPelicula(codPelicula);
        if (pelicula != null) {
            System.out.println("Datos de la película:");
            System.out.println("Código película: " + pelicula.getCodPelicula());
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Actor principal: " + pelicula.getNombreActor());
        } else {
            System.out.println("Película no encontrada.");
        }
    }

    private static void listarPeliculas() {
        String msj = salaDeCine.listarPeliculasEstreno();
        System.out.println(msj);
    }

    private static void eliminarPelicula() {
        int codPelicula = obtenerCodigo("Ingrese código de película a eliminar: ");
        boolean eliminado = salaDeCine.eliminarPelicula(codPelicula);
        if (eliminado) {
            System.out.println("Película eliminada con éxito.");
        } else {
            System.out.println("Película no encontrada.");
        }
    }

    private static int obtenerCodigo(String mensaje) {
        int codigo = -1;
        System.out.println(mensaje);
        while (codigo < 0) {
            try {
                codigo = read.nextInt();
                if (codigo < 0) {
                    System.out.println("Código inválido. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número.");
                read.next(); // Limpiar el buffer
            }
        }
        return codigo;
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}
