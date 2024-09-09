package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * La información que se requiere almacenar es:
 * Película: título, género, director y protagonista (actor).
 * Título: debe contener 6 caracteres.
 * 
 * @author Ivan Bustos 
 */
/**
 * Clase que representa una película en un cine.
 */

public class Pelicula {
    private int codPelicula;
    private String titulo;
    private String genero;
    private String director;
    private String nombreActor;

    private static List<Pelicula> listaPeliculas = new ArrayList<>();

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, String director, String nombreActor) {
        this.codPelicula = new Random().nextInt(1000); // Generar código aleatorio
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.nombreActor = nombreActor;
    }
    // Getters y Setters
    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public static void agregarPelicula(Pelicula p) {
        listaPeliculas.add(p);
    }

    public static Pelicula buscarPelicula(int codPelicula) {
        for (Pelicula p : listaPeliculas) {
            if (p.getCodPelicula() == codPelicula) {
                return p;
            }
        }
        return null;
    }
}

