CREATE TABLE IF NOT EXISTS topicos(
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100),
    mensaje  VARCHAR(350),
    fecha_creacion DATE,
    estado VARCHAR(30),
    autor_id BIGINT,
    curso_id BIGINT,
    FOREIGN KEY(autor_id) REFERENCES usuarios(id),
    FOREIGN KEY(curso_id) REFERENCES cursos(id)
)