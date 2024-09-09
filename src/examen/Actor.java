package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * La información que se requiere almacenar es:
 * Actor: nombre, edad, nacionalidad y sexo (Hombre: H, Mujer: M).
 * Edad: mayor igual a 18
 * 
 * @author Ivan Bustos 
 */
public class Actor {

    private int codActor;
    private String nombre;
    private int edad;
    private char sexo;
    private String nacionalidad;
    private List<Actor> listaActores;
    private List<Actor> listaActorPelicula;

    public Actor() {
        this.listaActores = new ArrayList<>();
        this.listaActorPelicula = new ArrayList<>();
    }

    public Actor(int codActor, String nombre, int edad, char sexo, String nacionalidad) {
        this.codActor = codActor;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.listaActores = new ArrayList<>();
        this.listaActorPelicula = new ArrayList<>();
    }

    public int getCodActor() {
        return codActor;
    }

    public void setCodActor(int codActor) {
        this.codActor = codActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String agregarActor(int codActor, String nombre, int edad, char sexo, String nacionalidad) {
        Actor a = new Actor(codActor, nombre, edad, sexo, nacionalidad);
        listaActores.add(a);
        return "Ingreso Exitoso";
    }

    public String buscarActor(int codActor) {
        StringBuilder sb = new StringBuilder();
        for (Actor a : listaActores) {
            if (a.getCodActor() == codActor) {
                sb.append("Datos del Actor:\n")
                  .append("-----------------------------------------\n")
                  .append("Codigo Actor: ").append(a.getCodActor()).append("\n")
                  .append("Nombre: ").append(a.getNombre()).append("\n")
                  .append("Edad: ").append(a.getEdad()).append("\n")
                  .append("Sexo: ").append(a.getSexo()).append("\n")
                  .append("Nacionalidad: ").append(a.getNacionalidad()).append("\n");
                return sb.toString();
            }
        }
        return "No se encontró el actor.";
    }

    public String eliminarActor(int codActor) {
        for (Actor a : listaActores) {
            if (a.getCodActor() == codActor) {
                listaActores.remove(a);
                return "Actor eliminado";
            }
        }
        return "No se encontró el actor";
    }

    public String listarActores() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Actor a : listaActores) {
            sb.append("Datos del Actor ").append(i++).append("\n")
              .append("-----------------------------------------\n")
              .append("Codigo Actor: ").append(a.getCodActor()).append("\n")
              .append("Nombre: ").append(a.getNombre()).append("\n")
              .append("Edad: ").append(a.getEdad()).append("\n")
              .append("Sexo: ").append(a.getSexo()).append("\n")
              .append("Nacionalidad: ").append(a.getNacionalidad()).append("\n");
        }
        return sb.toString();
    }

    public String listarActoresPorSexo(char sexo) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Actor a : listaActores) {
            if (a.getSexo() == sexo) {
                sb.append("Datos del Actor ").append(i++).append("\n")
                  .append("-----------------------------------------\n")
                  .append("Codigo Actor: ").append(a.getCodActor()).append("\n")
                  .append("Nombre: ").append(a.getNombre()).append("\n")
                  .append("Edad: ").append(a.getEdad()).append("\n")
                  .append("Sexo: ").append(a.getSexo()).append("\n")
                  .append("Nacionalidad: ").append(a.getNacionalidad()).append("\n");
            }
        }
        return sb.toString();
    }

    public String listarActoresJovenes() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Actor a : listaActores) {
            if (a.getEdad() >= 12 && a.getEdad() <= 25) {
                sb.append("Datos del Actor ").append(i++).append("\n")
                  .append("-----------------------------------------\n")
                  .append("Codigo Actor: ").append(a.getCodActor()).append("\n")
                  .append("Nombre: ").append(a.getNombre()).append("\n")
                  .append("Edad: ").append(a.getEdad()).append("\n")
                  .append("Sexo: ").append(a.getSexo()).append("\n")
                  .append("Nacionalidad: ").append(a.getNacionalidad()).append("\n");
            }
        }
        return sb.toString();
    }

    public String agregarActorPelicula(int codActor, int codPelicula) {
        return "Método no implementado";
    }

    public String listarActorPelicula() {
        return "Método no implementado";
    }

    public static void MenuActores() {
        Scanner read = new Scanner(System.in);
        Actor a = new Actor();
        int edad, codActor, codPelicula;
        String nombre, nacionalidad;
        char sexo;
        int opcion;

        do {
            System.out.println("Bienvenido al menú de Actores");
            System.out.println("1.- Agregar Actor");
            System.out.println("2.- Buscar Actor");
            System.out.println("3.- Eliminar Actor");
            System.out.println("4.- Listar Actores");
            System.out.println("5.- Listar Actores mujeres");
            System.out.println("6.- Listar Actores jóvenes");
            System.out.println("0.- IR A MENÚ PRINCIPAL");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del Actor: ");
                    nombre = read.next();
                    System.out.println("Ingrese edad del Actor: ");
                    edad = read.nextInt();
                    System.out.println("Ingrese sexo (H - Hombre / M - Mujer): ");
                    sexo = Character.toUpperCase(read.next().charAt(0));
                    System.out.println("Ingrese nacionalidad: ");
                    nacionalidad = read.next();
                    int codigo = new Random().nextInt(1000); // Genera un código aleatorio
                    System.out.println(a.agregarActor(codigo, nombre, edad, sexo, nacionalidad));
                    break;
                case 2:
                    System.out.println("Ingrese código del Actor a buscar: ");
                    codActor = read.nextInt();
                    System.out.println(a.buscarActor(codActor));
                    break;
                case 3:
                    System.out.println("Ingrese código del Actor para eliminar: ");
                    codActor = read.nextInt();
                    System.out.println(a.eliminarActor(codActor));
                    break;
                case 4:
                    System.out.println(a.listarActores());
                    break;
                case 5:
                    System.out.println(a.listarActoresPorSexo('M'));
                    break;
                case 6:
                    System.out.println(a.listarActoresJovenes());
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        read.close();
    }
}
