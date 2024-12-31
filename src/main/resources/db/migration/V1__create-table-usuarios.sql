CREATE TABLE IF NOT EXISTS usuarios(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(150),
    email  VARCHAR(100),
    contrasena VARCHAR(200),
    tipo VARCHAR(30)
)