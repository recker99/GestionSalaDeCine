/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PruebasUnitarias;

import examen.Pelicula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivanb
 */
public class PeliculaTest {
    
    public PeliculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
 private Pelicula pelicula;

    @Before
    public void setUp() {
        // Inicializa el objeto necesario para las pruebas
        pelicula = new Pelicula();
    }

    @After
    public void tearDown() {
        // Limpia cualquier configuración después de cada prueba, si es necesario
    }

    @Test
    public void testAgregarPelicula() {
        // Configura los datos de prueba
        String titulo = "Titulo";
        String genero = "Genero";
        String director = "Director";
        String actorPrincipal = "ActorPrincipal";
        
        // Crea una nueva película y la agrega
        Pelicula nuevaPelicula = new Pelicula(titulo, genero, director, actorPrincipal);
        Pelicula.agregarPelicula(nuevaPelicula);
        
        // Verifica que se ha agregado una película
        Pelicula peliculaEncontrada = Pelicula.buscarPelicula(nuevaPelicula.getCodPelicula());
        assertNotNull("La película debería estar en la lista", peliculaEncontrada);
        assertEquals("El título debería coincidir", titulo, peliculaEncontrada.getTitulo());
        assertEquals("El género debería coincidir", genero, peliculaEncontrada.getGenero());
        assertEquals("El director debería coincidir", director, peliculaEncontrada.getDirector());
        assertEquals("El actor principal debería coincidir", actorPrincipal, peliculaEncontrada.getNombreActor());
    }

    @Test
    public void testBuscarPelicula() {
        // Configura los datos de prueba
        String titulo = "Titulo";
        String genero = "Genero";
        String director = "Director";
        String actorPrincipal = "ActorPrincipal";
        
        // Agrega una película
        Pelicula nuevaPelicula = new Pelicula(titulo, genero, director, actorPrincipal);
        Pelicula.agregarPelicula(nuevaPelicula);

        // Busca la película usando el código obtenido
        Pelicula peliculaEncontrada = Pelicula.buscarPelicula(nuevaPelicula.getCodPelicula());

        // Verifica que el resultado no sea nulo
        assertNotNull("La película debería estar en la lista", peliculaEncontrada);

        // Verifica que el resultado contenga los datos de la película
        assertEquals("El título debería coincidir", titulo, peliculaEncontrada.getTitulo());
        assertEquals("El género debería coincidir", genero, peliculaEncontrada.getGenero());
        assertEquals("El director debería coincidir", director, peliculaEncontrada.getDirector());
        assertEquals("El actor principal debería coincidir", actorPrincipal, peliculaEncontrada.getNombreActor());
    }
}
