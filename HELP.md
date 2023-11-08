# CARDS 

### Test Unitarios (Ejercicio 1)

```
 mvn test

```
![img.png](img.png)

### Ejecución del servicio

```
 mvn spring-boot:run

```
### Ejecución en Docker

```
 // Para generar la imagen
 
 docker build -t cards .
 
 // Para ejecutar dicha imagen en un contenedor
 
 docker run -p 8080:8080 cards

```

### Documentacion Swagger Open-Api 3.0

```
http://localhost:8080/cards/swagger-ui/index.html
```