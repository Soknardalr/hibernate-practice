DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, score int, name VARCHAR(255), PRIMARY KEY(id));
INSERT INTO users (name, score) VALUES ('Bob', 60), ('Jack', 10), ('Hogn', 224);