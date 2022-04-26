# Taller de productividad basadaen herramientas tecnológicas
# WISOM STUDIO WEB

## Descripción
Proyecto Web creado para una pyme con giro artistico, de personalización de espacios y articulos.
Se crea una página desarrollada en java con la herramienta Spring Boot, para mostrar los servicios y productos de la empresa.

## Problema identificado
Este proyecto se basa en la necesidad de la empresa WISOM STUDIO de ampliar su mercado y alcance. 
Buscando llegar a nuevos clientes se crea un sitio web que muestra sus productos y servicios, además que registra potenciales clientes.

## Tabla de contenidos

- src
  - main
    - java/com/example/demo/app
      - controller
        - ClienteController.java
        - HomeController.java
      - models
        - entity
          - ciudad.java
          - cliente.java
        - repository
          - ciudadRepository
          - clienteRepository
        - service
          - CiudadServiceImpl.java
          - ClienteServiceImpl.java
          - iCiudadService.java
          - iCliente.java
    - resources
      - static
      - templates
        - error
          - 400.html
          - 404.html
        - plantilla
          - template.hmtl
         - views/clientes
          - frmCrear.html
          - listar.html
        - home.html
- HELP.md
- README.md
- pom.xml

## Requerimientos
- ApacheTomcat 10.0.0
- java version 17.0.1
- navegador
- acceso a internet
- crear un usuario con contraseña
- MySQL Workbench
- Editar el archivo applications.properties con el uso horario correspondiente a tu localización

## Instalación

1. Descargar el proyecto del repositorio
2. Descomprimir el archivo para obtener la carpeta del proyecto
3. Abrimos la carpeta del proyecto
4. Abrimos la carpeta de bin en la cual encontraremos el archivo .jar
5. Iniciamos el ejecutable
Como es un .jar el software no se instala, solo se ejecuta en el ambiente de JAVA por eso es importante que tengamos la ultima version de java instalada en nuestro equipo.

## Configuración

* Configuramos la base de datos para que esté cargada en un servicio de MySQL Workbench
* Configuracmos el ambiente de java

## Contribución
- Abrimos el repositorio
- Link del repositorio (https://github.com/IvanIslasG/WisomStudioWeb.git)
- En el branch "Develop" podemos encontrar la version mas actual del software y la mas completa y estable
- Del lado derecho tenemos la opcion de clone or download
- Baja los archivos necesarios

## Roadmap
Aún falta mucho desarrollo de la aplicación, pero conforme pase el tiempo se irán añadiendo las secciones de código para que sea funcional al 100%
El software sigue en fase de desarrollo
