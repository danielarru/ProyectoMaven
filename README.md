# Proyect# CRUD Maven Project

Este proyecto implementa una aplicación Java basada en Maven que se conecta a una base de datos MySQL y realiza operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una tabla de usuarios. Además, está diseñado para incorporar pruebas unitarias con JUnit y permite gestionar diferentes perfiles de conexión mediante Maven.

## **Estructura del Proyecto**
- **`pom.xml`**: Configuración del proyecto Maven.
- **`src/main/java`**:
  - **`org.maven.DatabaseConnection`**: Clase para manejar la conexión a la base de datos con JDBC.
  - **`org.maven.model.User`**: Modelo para representar la tabla de usuarios.
  - **`org.maven.dao.UserDAO`**: Clase DAO que implementa las operaciones CRUD.

---


## **Configuración de la Base de Datos**
1. Crear una base de datos AWS AuroraSQL.
2. Ejecutar el siguiente script para configurar la tabla `usuarios`:

```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

3. Configura las credenciales de conexión a la base de datos en el archivo `pom.xml` dentro de los perfiles Maven:


Para activar un perfil, utiliza el siguiente comando Maven:
```bash
mvn clean install -P master
```

---

## **Cómo Ejecutar el Proyecto**

### 1. Compilar el Proyecto:
Ejecuta el siguiente comando desde la raíz del proyecto:
```bash
mvn clean install
```

### 2. Ejecutar el CRUD:
Crea una clase principal en el paquete `org.maven` para probar las operaciones CRUD implementadas en `UserDAO`.

oMaven
