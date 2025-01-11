create table employee
(
    eid       int auto_increment
        primary key,
    firstname varchar(30) not null,
    lastname  varchar(30) not null,
    email     varchar(50) not null
);

INSERT INTO db_example.employee (eid, firstname, lastname, email) VALUES (6, 'Jdbc', 'Jdbc', 'Jdbc@Jdbc.com');
INSERT INTO db_example.employee (eid, firstname, lastname, email) VALUES (8, 'Jdbc', 'Jdbc', 'Jdbc@Jdbc.com');
INSERT INTO db_example.employee (eid, firstname, lastname, email) VALUES (10, 'Jdbc', 'Jdbc', 'Jdbc@Jdbc.com');
INSERT INTO db_example.employee (eid, firstname, lastname, email) VALUES (13, 'Jdbc', 'Jdbc', 'Jdbc@Jdbc.com');