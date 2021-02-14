DROP TABLE teacher IF EXISTS;
DROP TABLE subject IF EXISTS;
DROP TABLE class IF EXISTS;
DROP TABLE student IF EXISTS;
DROP TABLE teacher_subject IF EXISTS;

CREATE TABLE teacher (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30),
  age        INTEGER,
  gender     VARCHAR(1)
);
CREATE INDEX id1 ON teacher (id);

CREATE TABLE student (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30),
  age        INTEGER,
  gender     VARCHAR(1),
  class_id   INTEGER
);
CREATE INDEX id2 ON student (id);

CREATE TABLE class (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30),
  year VARCHAR(30)
);
CREATE INDEX id3 ON class (id);

CREATE TABLE subject (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30)
);
CREATE INDEX id4 ON subject (id);

CREATE TABLE teacher_subject (
  id         INTEGER IDENTITY PRIMARY KEY,
  class_id INTEGER,
  subject_id INTEGER,
  teacher_id INTEGER
);
CREATE INDEX id13 ON teacher_subject (id);
CREATE INDEX id23 ON teacher_subject (class_id,subject_id,teacher_id);

