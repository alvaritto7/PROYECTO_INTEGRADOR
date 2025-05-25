
DROP TABLE if exists inscripciones;
DROP TABLE if exists actividades;
DROP TABLE if exists sala ;
DROP TABLE if exists usuario;

/*Tabla de Usuarios.*/
CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
	matricula varchar(10) NOT NULL UNIQUE,
    nombre_usuario VARCHAR(100)  UNIQUE,
	apellidos_usuario varchar(100),
	email varchar(150),
	cicloEducativo ENUM('DAW', 'DAM', 'ASIR', 'A3D', 'TAFD', 'EI', 'CI') NOT NULL,
    password VARCHAR(25) NOT NULL
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
INSERT INTO usuario (matricula, nombre_usuario, apellidos_usuario, email, cicloEducativo, password) VALUES
('0001', 'Hugochu', 'García Pérez', 'hugochu@example.com', 'DAW', '0001'),
('0002', 'Lucia', 'Martínez López', 'lucia@example.com', 'TAFD', '0002'),
('0003', 'Marcos', 'Sánchez Díaz', 'marcos@example.com', 'TAFD', '0003'),
('0004', 'Ana', 'Fernández Ruiz', 'ana@example.com', 'A3D', '0004'),
('0005', 'Alvaro', 'Gómez Torres', 'alvaro@example.com', 'EI', '0005'),
('0006', 'Adrian', 'Moreno Núñez', 'adrian@example.com', 'CI', '0006'),
('0007', 'Carlos', 'Ramírez Ortega', 'carlos@example.com', 'DAM', '0007'),
('0008', 'Elena', 'Jiménez Alba', 'elena@example.com', 'DAW', '0008'),
('0009', 'Sofía', 'Navarro Gil', 'sofia@example.com', 'ASIR', '0009'),
('0010', 'Jorge', 'Domínguez León', 'jorge@example.com', 'TAFD', '0010'),
('0011', 'Paula', 'Castillo Vela', 'paula@example.com', 'CI', '0011'),
('0012', 'David', 'Reyes Ríos', 'david@example.com', 'DAM', '0012');


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