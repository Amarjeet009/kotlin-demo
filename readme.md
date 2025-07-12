## 📘 Demo Application of Kotlin, Postgres SQL and Webflux Reactive Programming

This document outlines the structure of the employee management system built using PostgreSQL.
***
### Run Docker Image
```jsunicoderegexp
docker image

```
```jsunicoderegexp
docker ps
```
```jsunicoderegexp
docker run --name app-postgres -e POSTGRES_PASSWORD=password -p 5433:5432 -d postgres
```
```jsunicoderegexp
docker stop app-postgres
```
```jsunicoderegexp
docker start app-postgres
```
```jsunicoderegexp
docker rm app-postgres  (if need to remove)
```
***



### Table: `department`

```sql
CREATE TABLE IF NOT EXISTS department (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    department_name VARCHAR(250),
    is_active INTEGER
);

INSERT INTO department (department_name, is_active) VALUES
('Human Resource', 1),
('IT Tech', 1),
('IT Support', 1);
```


### `To build your project using Gradle from the command line, you can run:`
```jsunicoderegexp
./gradlew build
```
### `If you're on Windows, use:`
```jsunicoderegexp
gradlew.bat build
```
### `To clean the build before compiling:`
```jsunicoderegexp
./gradlew clean build
```
### `To skip tests:`
```jsunicoderegexp
./gradlew build -x test
```
### `To run your app (if using the application plugin):`
```jsunicoderegexp
./gradlew run
```

### `Docker build`
```jsunicoderegexp
docker build -t my-backend-service .
```
### `Run Docker build`
```jsunicoderegexp
docker run -p 8082:8080 my-backend-service
```