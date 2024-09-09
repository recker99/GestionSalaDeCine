/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import examen.Actor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casa
 */
public class ActorTest {
    
    public ActorTest() {
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
    
   private Actor actor;

    @Before
    public void setUp() {
        // Inicializa los objetos necesarios para las pruebas
        actor = new Actor();
    }

    @After
    public void tearDown() {
        // Limpia cualquier configuración después de cada prueba, si es necesario
    }

    @Test
    public void testAgregarActor() {
        // Configura los datos de prueba
        int codActor = 1;
        String nombre = "John Doe";
        int edad = 35;
        char sexo = 'H';
        String nacionalidad = "USA";
        
        // Llama al método que deseas probar
        String resultado = actor.agregarActor(codActor, nombre, edad, sexo, nacionalidad);
        
        // Verifica el resultado esperado
        assertEquals("Ingreso Exitoso", resultado);
    }

    @Test
    public void testBuscarActor() {
        // Agrega un actor a la lista
        int codActor = 2;
        String nombre = "Jane Doe";
        int edad = 30;
        char sexo = 'M';
        String nacionalidad = "UK";
        actor.agregarActor(codActor, nombre, edad, sexo, nacionalidad);
        
        // Busca el actor y verifica los datos
        String resultado = actor.buscarActor(codActor);
        assertNotNull(resultado);
        assertTrue(resultado.contains(nombre));
        assertTrue(resultado.contains(Integer.toString(edad)));
        assertTrue(resultado.contains(Character.toString(sexo)));
        assertTrue(resultado.contains(nacionalidad));
    }

    @Test
    public void testEliminarActor() {
        // Agrega un actor a la lista
        int codActor = 3;
        String nombre = "Alice Smith";
        int edad = 28;
        char sexo = 'F';
        String nacionalidad = "Canada";
        actor.agregarActor(codActor, nombre, edad, sexo, nacionalidad);
        
        // Elimina el actor
        String resultado = actor.eliminarActor(codActor);
        assertEquals("Actor eliminado", resultado);
        
        // Verifica que el actor ha sido eliminado
        String buscarResultado = actor.buscarActor(codActor);
        assertEquals("No se encontró el actor.", buscarResultado);
    }

    @Test
    public void testListarActores() {
        // Agrega algunos actores a la lista
        actor.agregarActor(4, "Tom Hanks", 67, 'H', "USA");
        actor.agregarActor(5, "Natalie Portman", 43, 'F', "USA");
        
        // Listar los actores y verificar el resultado
        String listado = actor.listarActores();
        assertNotNull(listado);
        assertTrue(listado.contains("Tom Hanks"));
        assertTrue(listado.contains("Natalie Portman"));
    }
}
