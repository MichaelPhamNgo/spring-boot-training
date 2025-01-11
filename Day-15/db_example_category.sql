create table category
(
    id   int auto_increment
        primary key,
    name varchar(250) not null
);

INSERT INTO db_example.category (id, name) VALUES (1, 'iphone');
INSERT INTO db_example.category (id, name) VALUES (2, 'ipad');
INSERT INTO db_example.category (id, name) VALUES (3, 'apple watch');