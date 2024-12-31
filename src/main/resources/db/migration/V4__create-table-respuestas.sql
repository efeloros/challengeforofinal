CREATE TABLE IF NOT EXISTS respuestas(
    id SERIAL PRIMARY KEY,
    mensaje VARCHAR(350),
    topico_id  BIGINT,
    fecha_creacion DATE,
    autor_id BIGINT,
    solucion BOOLEAN,
    FOREIGN KEY(topico_id) REFERENCES topicos(id),
    FOREIGN KEY(autor_id) REFERENCES usuarios(id)
)