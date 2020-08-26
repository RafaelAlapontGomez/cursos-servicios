drop table if exists profesor;
create table profesor
(
   id        integer      auto_increment primary key,
   nombre    varchar(50)  not null,
   apellido1 varchar(50)  not null,
   apellido2 varchar(50)  not null
);


drop table if exists curso;
create table curso
(
   id          integer 		auto_increment  primary key,
   titulo      varchar(255) not null,
   nivel 	   varchar(15)  not null,
   numHoras    integer      not null,
   activo      boolean      not null,
   profesorId  integer      not null,
   CONSTRAINT fk_curso_profesor foreign key (profesorId) references profesor(id)
);


