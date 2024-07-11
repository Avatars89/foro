CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha DATETIME NOT NULL,
    status ENUM('ACTIVO', 'INACTIVO') NOT NULL,
    autor BIGINT,
    curso VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (autor              ) REFERENCES usuarios(id)
);