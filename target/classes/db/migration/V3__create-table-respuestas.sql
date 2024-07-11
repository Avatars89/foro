CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fechaCreacion DATETIME NOT NULL,
    mensaje TEXT NOT NULL,
    solucion TEXT NOT NULL,
    autor BIGINT,
    topico BIGINT,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (autor) REFERENCES usuarios(id),
    FOREIGN KEY (topico) REFERENCES topicos(id)
);