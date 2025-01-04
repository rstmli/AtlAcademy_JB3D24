CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100),
                       age numeric,
                       subject VARCHAR(100)
);

INSERT INTO users (name, age, subject)
VALUES
    ('Huseyn Rustamli', 24, 'developer'),
    ('Huseyn Aliyev', 19, 'Mathematics'),
    ('Ilkin', 26, 'developer'),
    ('Emin', 24, 'Mathematics'),
    ('Kanan', 23, 'Mathematics'),
    ('Musa', 27, 'Mathematics'),
    ('Asha', 27, 'Mathematics'),
    ('Ulkar', 21, 'Mathematics'),
    ('Xanbala', 23, 'developer'),
    ('Samad', 36, 'Mathematics'),
    ('Tofiq', 21, 'developer'),
    ('Samad', 36, 'Mathematics'),
    ('Ismayil', 20, 'Mathematics'),
    ('Aytac', 21, 'developer');

SELECT * FROM users
SELECT * FROM users WHERE subject = 'Mathematics'
UPDATE users SET age = 23 WHERE name = 'Huseyn Rustamli'

DELETE FROM users WHERE age = 20
SELECT name,age FROM users ORDER BY age DESC
SELECT name,age FROM users WHERE age > 21
SELECT sum(age) FROM users
SELECT count(*) from users