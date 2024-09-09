package examen;

import java.util.ArrayList;
import java.util.List;

/**
 * La información que se requiere almacenar es:
 * Películas (List que almacena objetos de la clase Película)
 * 
 * @autor Ivan Bustos 
 */
public class SalaDeCine {
    private List<Pelicula> listaPeliculasEstreno;

    public SalaDeCine() {
        this.listaPeliculasEstreno = new ArrayList<>();
    }

    public List<Pelicula> getListaPeliculasEstreno() {
        return listaPeliculasEstreno;
    }

    public void agregarPeliculaEstreno(Pelicula pelicula) {
        listaPeliculasEstreno.add(pelicula);
    }

    public String listarPeliculasEstreno() {
        if (listaPeliculasEstreno.isEmpty()) {
            return "No hay películas en estreno.";
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Pelicula p : listaPeliculasEstreno) {
            sb.append("Datos de la película ").append(i++).append("\n")
              .append("-----------------------------------------\n")
              .append("Código película: ").append(p.getCodPelicula()).append("\n")
              .append("Título: ").append(p.getTitulo()).append("\n")
              .append("Género: ").append(p.getGenero()).append("\n")
              .append("Director: ").append(p.getDirector()).append("\n")
              .append("Actor principal: ").append(p.getNombreActor()).append("\n") 
              .append("\n"); // Espacio adicional entre películas
        }
        return sb.toString();
    }
    
    public Pelicula buscarPelicula(int codPelicula) {
        for (Pelicula p : listaPeliculasEstreno) {
            if (p.getCodPelicula() == codPelicula) {
                return p;
            }
        }
        return null; // No se encontró la película
    }
    
    public boolean eliminarPelicula(int codPelicula) {
        return listaPeliculasEstreno.removeIf(p -> p.getCodPelicula() == codPelicula);
    }
}
