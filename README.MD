# Gestión de Sala de Cine

## Descripción

El sistema de **Gestión de Sala de Cine** está diseñado para administrar y mantener un registro de las películas en exhibición en una sala de cine. Permite realizar diversas operaciones clave para la gestión eficiente de las películas que se están mostrando o se han mostrado en la sala. Las funcionalidades principales del sistema incluyen:

- **Agregar Películas**: Permite registrar nuevas películas en la base de datos del sistema, incluyendo detalles como título, género, director y nombre del actor principal. Cada película recibe un código único generado aleatoriamente para su identificación.

- **Buscar Películas**: Facilita la búsqueda de películas específicas mediante su código único. Permite a los usuarios recuperar la información completa sobre una película particular para su visualización o edición.

- **Listar Películas**: Muestra una lista completa de todas las películas en exhibición. Esta lista proporciona un resumen de cada película, mostrando su código, título, género, director y actor principal.

- **Eliminar Películas**: Permite la eliminación de películas de la base de datos basándose en su código único. Esta función es útil para mantener la base de datos actualizada y libre de entradas obsoletas.

## Características Adicionales

- **Interfaz de Usuario**: El sistema proporciona una interfaz amigable para que los usuarios interactúen con las funcionalidades del sistema a través de un menú principal.

- **Validación de Datos**: Se asegura de que la entrada de datos sea válida y consistente, incluyendo la validación de códigos y títulos.

- **Persistencia de Datos**: Mantiene un registro persistente de las películas a través de una estructura de datos en memoria durante la ejecución del programa.

## Objetivo

El objetivo del sistema es simplificar y automatizar el proceso de gestión de películas en una sala de cine, proporcionando una herramienta eficaz para que los administradores gestionen el catálogo de películas de manera ordenada y eficiente.

## Uso

1. **Ejecutar el programa**: Inicie el sistema ejecutando la clase `Menu` para acceder a las opciones de gestión.
2. **Seleccionar una opción**: Use el menú para agregar, buscar, listar o eliminar películas.
3. **Interacción**: Siga las instrucciones en pantalla para ingresar los datos necesarios o realizar las acciones deseadas.

## Pruebas

El sistema incluye pruebas unitarias para verificar el correcto funcionamiento de las operaciones principales. Las pruebas están implementadas en la clase `PeliculaTest`.

## Contribuciones

Las contribuciones al proyecto son bienvenidas. Para contribuir, por favor haga un fork del repositorio, realice los cambios necesarios y envíe un pull request.

## Licencias

El sistema de **Gestión de Sala de Cine** utiliza varias herramientas y bibliotecas de terceros. A continuación se detallan las licencias correspondientes:

### Java

Este proyecto utiliza Java, que está bajo la **Licencia de Oracle Binary Code License Agreement**. Para más detalles, consulte el [sitio web de Oracle](https://www.oracle.com/java/technologies/javase-license.html).

### JUnit

JUnit es un marco de pruebas unitarias para Java. Se distribuye bajo la **Licencia Pública de Eclipse (EPL)**. Puede encontrar más información en el [sitio web de JUnit](https://junit.org/junit4/).

### NetBeans

NetBeans es un entorno de desarrollo integrado (IDE) que se utiliza para desarrollar aplicaciones Java. Está bajo la **Licencia Pública de Apache (Apache License 2.0)**. Para más información, consulte el [sitio web de NetBeans](https://netbeans.apache.org/).

### Otros

- **Bibliotecas de Java Standard**: Estas bibliotecas están bajo la **Licencia de Oracle Binary Code License Agreement**.
- **Dependencias de Maven**: Las bibliotecas y dependencias adicionales gestionadas a través de Maven pueden tener diversas licencias. Consulte los archivos de licencia incluidos en cada dependencia para obtener detalles específicos.

