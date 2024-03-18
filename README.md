# API de Usuarios

## Descripción
Este es un API simple para la gestión de usuarios. Permite recuperar todos los usuarios existentes y también insertar nuevos usuarios en la base de datos.

## Endpoints

- `GET /users`: Recupera todos los usuarios.
- `POST /users`: Inserta un nuevo usuario en la base de datos.

  **Body de la solicitud:**
  ```json
  {
      "name": "nombreEjemplo",
      "password": "contraseñaEjemplo"
  }

## Versiones

- **Java**: 11.0.0.1
- **Maven**: 3.9.6
- **STS**: 3.2.3
