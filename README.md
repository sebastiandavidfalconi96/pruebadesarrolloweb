# Tienda Virtual - README

La Tienda Virtual es una aplicación web diseñada para permitir a los usuarios explorar y gestionar una lista de productos. La aplicación se basa en una arquitectura de cliente-servidor, donde el cliente interactúa con la interfaz de usuario y consume la API proporcionada por el servidor para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la lista de productos.

## Acceso a la Tienda Virtual

La Tienda Virtual se puede acceder a través de un navegador web utilizando la URL proporcionada por el servidor. Al ingresar a la página, los usuarios se encontrarán con una interfaz intuitiva que muestra una lista de productos disponibles, detalles de los productos, y la opción de agregar productos al carrito de compras.

## API de la Tienda Virtual

La API de la Tienda Virtual permite a los usuarios realizar operaciones CRUD en la lista de productos. La API se encuentra en la ruta `/api/v1/products` del servidor y proporciona los siguientes puntos finales:

- **GET `/api/v1/products`**: Obtiene una lista de todos los productos disponibles.
- **GET `/api/v1/products/{id}`**: Obtiene los detalles de un producto específico por su ID.
- **POST `/api/v1/products`**: Crea un nuevo producto con la información proporcionada.
- **PUT `/api/v1/products/{id}`**: Actualiza los detalles de un producto específico por su ID.
- **DELETE `/api/v1/products/{id}`**: Elimina un producto específico por su ID.

## Operaciones CRUD en la Interfaz de Usuario

La interfaz de usuario de la Tienda Virtual permite a los usuarios realizar las siguientes operaciones CRUD:

- **Crear Producto**: Los usuarios pueden completar un formulario para agregar un nuevo producto a la lista.
- **Leer Producto**: Los detalles de un producto se muestran cuando un usuario hace clic en el botón "Ver Detalles".
- **Actualizar Producto**: Los usuarios pueden editar los detalles de un producto haciendo clic en el botón "Editar".
- **Eliminar Producto**: Los productos pueden ser eliminados de la lista haciendo clic en el botón "Eliminar Producto".

## Consumo de la API en la Vista

La vista de la Tienda Virtual utiliza JavaScript para consumir la API proporcionada por el servidor. Cuando se carga la página, se realiza una solicitud GET a `/api/v1/products` para obtener la lista de productos disponibles. Los detalles de un producto se cargan cuando un usuario hace clic en el botón "Ver Detalles", y el formulario de edición se muestra cuando un usuario hace clic en el botón "Editar". Las operaciones de crear, actualizar y eliminar productos también involucran llamadas a la API para interactuar con los datos en el servidor.

## Requisitos del Sistema

- Navegador web moderno (recomendado: Chrome, Firefox, Edge, Safari)

## Cómo Ejecutar la Aplicación

Importar el Proyecto:

Abre Visual Studio 2022 y selecciona la opción "Abrir Proyecto o Solución" en la pantalla de inicio. Navega hasta la ubicación de tu proyecto Spring Boot y selecciona el archivo pom.xml para abrir el proyecto.

Configurar el Entorno:

Asegúrate de que tienes configurado el entorno de desarrollo adecuado para trabajar con Java y Spring Boot en Visual Studio. Esto incluye tener Java Development Kit (JDK) instalado y configurado en tu sistema.

Configurar el Servidor de Aplicaciones:

Si tu proyecto Spring Boot utiliza un servidor de aplicaciones integrado, como Tomcat, no es necesario configurar uno adicionalmente. Spring Boot generalmente incluye un servidor embebido que se ejecuta automáticamente.

Ejecutar la Aplicación:

En la barra de herramientas de Visual Studio, busca el botón de "Ejecutar" o "Depurar" (generalmente representado por un triángulo verde). Haz clic en este botón para compilar y ejecutar tu aplicación.

Acceder a la Aplicación:

Una vez que la aplicación se ejecute, abre un navegador web y accede a la URL proporcionada por Spring Boot. Normalmente, esto sería http://localhost:8090 si estás utilizando la configuración predeterminada.

Ver Resultados:

Una vez que accedas a la URL, deberías poder interactuar con la interfaz de usuario de la Tienda Virtual y realizar operaciones CRUD en la lista de productos.

Detener la Aplicación:

Puedes detener la aplicación en Visual Studio haciendo clic en el botón de "Detener" en la barra de herramientas o simplemente cerrando la ventana de Visual Studio.
## Autor

Sebastian Falconi

Andrés Estrada

Emilio Ñacato


## Atribuciones

Este README proporciona una visión general de cómo funciona la Tienda Virtual, cómo acceder a la API y cómo realizar operaciones CRUD en la interfaz de usuario. Personaliza la información con los detalles específicos de tu aplicación y la tecnología utilizada.
