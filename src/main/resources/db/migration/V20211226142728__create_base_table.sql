CREATE TABLE listings(
    id bigint NOT NULL PRIMARY KEY,
    name varchar(255),
    description varchar(255),
    price integer,
    content jsonb);