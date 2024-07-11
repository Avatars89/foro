# Desafio ForoHub

Tercer desafio de Alura One Back-end usando JAVA, el desafio tiene la finalidad de crear una API REST usando Java Spring.


## Tecnologias y Dependencias usadas

<strong>Java</strong> V. 17 junto al framework <strong>Spring Boot</strong><br>
Base de datos: <strong>MariaDB </strong><br>
Dependencias usadas: Spring Security, JWT (JSON Web Tokens), Spring Data JPA<br>
Para documentación: Swagger/OpenAPI

## Configuración BD

Si deseas usar la base de datos MySQL, cambia el archivo `application.properties` con la siguiente información.

```properties
spring.datasource.url=jdbc:mysql://localhost/forohub
spring.datasource.driver-class-name=com.mysql.cj.jdbc.DriverMySQL o MariaDB
spring.datasource.username=root
spring.datasource.password=root
```


## Endpoints

- `POST /users`: Registrar un nuevo usuario.
- `POST /login`: Iniciar sesión y obtener un token JWT.
- `POST /topics`: Crear un nuevo tópico.
- `GET /topics`: Listar todos los tópicos.
- `DELETE /topics/{id}`: Eliminar un tópico por ID.


