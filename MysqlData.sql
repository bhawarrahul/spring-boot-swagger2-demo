create databases IF NOT EXISTS student_db;

use student_db;
CREATE TABLE student (id INT, name VARCHAR(50), email VARCHAR(50));

INSERT INTO student (id,name,email) VALUES(1,"bunny","bunny@gmail.com");
INSERT INTO student (id,name,email) VALUES(2,"john","john@gmail.com");
INSERT INTO student (id,name,email) VALUES(3,"Tom","tom@yahoo.com");