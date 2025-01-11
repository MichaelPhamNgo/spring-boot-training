create table author
(
    id        int auto_increment
        primary key,
    firstname varchar(50)  not null,
    lastname  varchar(50)  not null,
    email     varchar(100) not null,
    version   int          not null
);

INSERT INTO db_example.author (id, firstname, lastname, email, version) VALUES (1, 'Tim', 'Cook', 'tim.cooker@apple.com', 4);