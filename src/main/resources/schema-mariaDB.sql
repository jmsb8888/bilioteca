create table libro(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);
INSERT INTO	libro(nombre, descripcion, imagen_url)
VALUES
('Diagramas y Polifonías. Experiencias de Pensamiento',
 'presenta las formas de constitución de un grupo de maestros y maestras que aceptaron la invitación a participar de una particular manera de pensar, sentir, enseñar, aprender y encontrarse con la infancia y la filosofía.',
 'https://simehbucket.s3.amazonaws.com/images/98b57847595e03aa1146031f8e1ec21a-medium.jpg'),
('Análisis y evaluación de la educación financiera en Boyacá ',
 ' El objetivo principal de este trabajo es analizar y evaluar el estado actual de la educación financiera en el departamento de Boyacá.',
 'https://simehbucket.s3.amazonaws.com/images/7a665c7977e7b9df2eee119f356f46c2-medium.jpg'),
('Tesoros fósiles de Firavitoba.',
 'En esta obra de divulgación científica converge la ciencia y el arte en la interpretación paleoambiental del miembro superior calcáreo de la Formación Tibasosa.',
 'https://simehbucket.s3.amazonaws.com/images/7a665c7977e7b9df2eee119f35ce13f2-medium.jpg'),
('Topología: un curso introductorio. Volumen I',
 'El presente libro está pensado para un curso de topología general que inicia desde una revisión de la teoría de conjuntos, sigue con las nociones básicas de topología, la construcción de nuevos espacios topológicos a partir de los conocidos, los espacios métricos, la continuidad, y finaliza con los conceptos de filtro, ultrafiltro, topología generalizada y estructura minimal.',
 'https://simehbucket.s3.amazonaws.com/images/7a665c7977e7b9df2eee119f3591a9ff-medium.jpg'),
('Métodos para la caracterización de la cerámica arqueológica',
 'Esta obra reúne un conjunto de técnicas para la caracterización de la cerámica arqueológica en laboratorio. Se basa en la premisa según la cual cualquier estudiante de Arqueología debería ser capaz de llevar a cabo una descripción detallada, estandarizada y de alto nivel técnico de la cerámica arqueológica, sin la necesaria asistencia de un tutor y con el uso de herramientas sencillas y fácilmente asequibles.',
 'https://simehbucket.s3.amazonaws.com/images/523c1d5ee7c38c0eb8aac7b18c6fa0fe-medium.jpg'),
('Gerencia de proyectos complejos',
 'La fundamentación teórica en gerencia de proyectos ha tratado de unificar  temáticas y requerimientos vinculados a la estandarización de procesos,  gestión de interesados, evaluación de requisitos y rendimientos sobre  productos o servicios concordantes al cumplimiento de objetivos estratégicos en las organizaciones;',
 'https://simehbucket.s3.amazonaws.com/images/16e0d14698cb5c5bd8ba5a97800d0caa-medium.jpg');

create table editorial(
    id int primary key auto_increment,
    nombre varchar(200) not null ,
    sitio_web varchar(500)
);

insert into editorial
(id, nombre, sitio_web)values
(1, 'Planeta','https://www.planetadelibros.com/editorial/editorial-planeta/8'),
(2, 'Mirahadas','https://www.mirahadas.com/'),
(3, 'Pre-Textos','https://www.pre-textos.com/'),
(4, 'Sexto Piso','https://sextopiso.mx/'),
(5, 'Nordica','https://www.nordicalibros.com/'),
(6, 'Acantilado','https://www.acantilado.es/'),
(7, 'La huerta grande','https://www.lahuertagrande.com/');

alter table libro
add column editorial_id int,
add foreign key (editorial_id) references editorial(id);
update libro set libro.editorial_id=1 where id in (1, 5);
update libro set libro.editorial_id=2 where id in (2);
update libro set libro.editorial_id=3 where id in (3);
update libro set libro.editorial_id=4 where id in (4);
update libro set libro.editorial_id=5 where id in (6);
update libro set libro.editorial_id=6 where id in (7);

alter table libro
modify editorial_id int not null ;
