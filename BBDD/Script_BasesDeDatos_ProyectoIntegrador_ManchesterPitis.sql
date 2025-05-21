
DROP TABLE if exists inscripciones;
DROP TABLE if exists actividades;
DROP TABLE if exists sala ;
DROP TABLE if exists usuario;

/*Tabla de Usuarios.*/
CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(25) NOT NULL,
    cicloEducativo ENUM('DAW', 'DAM', 'ASIR', 'A3D', 'TAFD', 'EI', 'CI') NOT NULL,
    tipo_usuario ENUM('monitor', 'alumno') NOT NULL DEFAULT 'alumno'
);


/*Tabla Salas.*/
CREATE TABLE sala (
    id_sala INT AUTO_INCREMENT PRIMARY KEY,
    codigo_Sala VARCHAR(10) NOT NULL UNIQUE,
    tipo_Sala VARCHAR(50) NOT NULL,
    capacidad_Sala INT NOT NULL,
    utilizacion DECIMAL(5,2),
    ocupacion DECIMAL(5,2)
);

/*Tabla de Actividades.*/
CREATE TABLE actividades (
    id_actividades int AUTO_INCREMENT PRIMARY KEY,
    nombre_actividad VARCHAR (100) NOT NULL,
    fecha_actividad DATE NOT NULL,
    hora_actividad TIME NOT NULL,
    duracion_actividad INT NOT NULL,
    plazas_actividad int NOT NULL,
    sala_id int NOT NULL,
    monitor_id int,
    FOREIGN KEY (monitor_id) REFERENCES usuario(id_usuario),
    FOREIGN KEY (sala_id) REFERENCES usuario(id_usuario)
);

/*Tabla de Inscripciones*/
CREATE TABLE inscripciones (
    id int AUTO_INCREMENT PRIMARY KEY,
    usuario_id int,
    actividad_id int,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id_usuario),
    FOREIGN KEY (actividad_id) REFERENCES actividades(id_actividades),
    UNIQUE (usuario_id, actividad_id)
);

/*INSERTS*/

-- Usuarios
INSERT INTO usuario (nombre_usuario, password, cicloEducativo, tipo_usuario) VALUES
('Hugochu', '00000', 'DAW', 'monitor'),
('Lucia', '00001', 'TAFD', 'monitor'),
('Marcos', '00002', 'TAFD', 'monitor'),
('Ana', '00003', 'A3D', 'alumno'),
('Alvaro', '00004', 'EI', 'alumno'),
('Adrian', '00005', 'CI', 'alumno');


-- Salas
INSERT INTO sala (codigo_sala, tipo_sala, capacidad_sala, utilizacion, ocupacion) VALUES
('PPA1', 'PABELLON', 40, 91.3, 29.88),
('PPA2', 'PABELLON', 40, 36.12, 27.46),
('PPA3', 'PABELLON', 40, 2.92, 63.19),
('PPIS', 'PISCINA', 40, 2.06, 59.66),
('PPB1', 'PISTAS DE BALONCESTO', 10, 2.27, 96.13),
('PPB2', 'PISTAS DE BALONCESTO', 10, 0.18, 94.03),
('PPE1', 'PISTAS ATLETISMO', 40, 2.11, 53.28),
('PPE2', 'PISTAS ATLETISMO', 40, 0.76, 54.76);

-- Actividades
INSERT INTO actividades (nombre_actividad, fecha_actividad, hora_actividad, duracion_actividad, plazas_actividad, monitor_id, sala_id) VALUES
('Voleybol', '2025-04-15', '10:00:00', 60, 20, 2, 1),
('Futbol', '2025-04-16', '11:00:00', 60, 15, 3, 2),
('Baloncesto', '2025-04-17', '09:00:00', 45, 10, 2, 3),
('Natación', '2025-04-18', '12:00:00', 90, 25, 3, 4),
('Baloncesto', '2025-04-19', '16:00:00', 90, 10, 2, 5);

-- Inscripciones
INSERT INTO inscripciones (usuario_id, actividad_id) VALUES
(1, 1),
(4, 1),
(5, 2),
(6, 3),
(1, 4),
(5, 5);