DROP TABLE usuario;
DROP TABLE inscripciones;
DROP TABLE sala ;
DROP TABLE actividades;


/*Tabla de Usuarios.*/
CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(100) NOT NULL UNIQUE,
    contrasena VARCHAR(25) NOT NULL,
    cicloEducativo ENUM('DAW', 'DAM', 'ASIR', 'A3D', 'TAFD', 'EI', 'CI') NOT NULL
);

/*Tabla Salas.*/
CREATE TABLE sala (
    id_sala INT AUTO_INCREMENT PRIMARY KEY,
    codigo_Sala VARCHAR(10) NOT NULL UNIQUE,
    tipo_Sala VARCHAR(50) NOT NULL,
    capacidad_Sala INT NOT NULL
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
    FOREIGN KEY (monitor_id) REFERENCES usuario(id)
);

/*Tabla de Inscripciones*/
CREATE TABLE inscripciones (
    id int AUTO_INCREMENT PRIMARY KEY,
    usuario_id int,
    actividad_id int,
    fecha_inscripcion DATE DEFAULT (CURRENT_DATE),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (actividad_id) REFERENCES actividades(id),
    UNIQUE (usuario_id, actividad_id)
);