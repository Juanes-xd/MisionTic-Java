-- ESTO ES UN COMENTARIO DE UNA LINEA
/*
*  ESTO ES UN COMENTARIO DE VARIAS LINEAS
*  ACA HAY OTRA LINEA
*/

-- Los archivos SQL se almacenan con extension .sql

-- CREACION DE ESTRUCTURAS
-- Crear Tablas
-- Estructura: 
/*
CREATE TABLE <<NOMBRE TABLA>> (
    <<COLUMNA 1>> <<TIPO>> <<RESTRICCIONES>>,
    <<COLUMNA 2>> <<TIPO>> <<RESTRICCIONES>>,
    <<COLUMNA 3>> <<TIPO>> <<RESTRICCIONES>>
    ...
    <<COLUMNA N>> <<TIPO>> <<RESTRICCIONES>>        
)
*/

CREATE TABLE ESTUDIANTES_SQL (
    CODIGO TEXT PRIMARY KEY NOT NULL,
    NOMBRE TEXT NOT NULL,
    APELLIDO TEXT NOT NULL,
    EDAD INT NOT NULL,
    CURSO_ACTUAL TEXT NOT NULL
);

-- INSERCION DE DATOS
/*
ESTRUCTURA: 
INSERT INTO <<NOMBRE TABLA>> (<<columna 1>>, <<columna 2>>, ..., <<columna n>>)
VALUES (<<valor 1>>, <<valor 2>>,...<<valor n>>)
NOTAS: 
- Las columnas no necesariamente son todas las columnas de la tabla, solo las que vamos a enviar valor
- Los valores dentro de VALUES van en el mismo orden que como se especificaron las columnas
*/

-- NOTA: Las cadenas de caracteres se representan con comilla simple ('). No se permite la doble comilla (")
INSERT INTO ESTUDIANTES_SQL(CODIGO, NOMBRE, APELLIDO, EDAD, CURSO_ACTUAL)
VALUES ('ABC123', 'Pedro', 'Perez', 18, 'Ciclo 2 Java');
INSERT INTO ESTUDIANTES_SQL(CODIGO, NOMBRE, APELLIDO, EDAD, CURSO_ACTUAL)
VALUES ('ABC456', 'Laura', 'Vargas', 18, 'Ciclo 2 Java');

-- Mostrar información de una tabla
-- Estructura:
/*
CASO #1: (Mostrar columnas especificas sin filtro)
SELECT <<col 1>> AS <<Alias>>, <<col 2>>, ..., <<col n>>
FROM <<Nombre Tabla>>
NOTA: 
- A las columnas se les puede poner un ALIAS
- Se Pueden hacer operaciones entre los valores para mostrar
*/
SELECT CURSO_ACTUAL AS CURSO, CODIGO, NOMBRE, APELLIDO, EDAD
FROM ESTUDIANTES_SQL;

SELECT CODIGO, (NOMBRE || ' ' || APELLIDO) AS NOMBRE_COMPLETO, EDAD, CURSO_ACTUAL AS CURSO
FROM ESTUDIANTES_SQL;

/*
CASO #2: (Mostrar todas las columnas de una tabla, sin filtros)
SELECT *
FROM <<Nombre Tabla>>
*/
SELECT *
FROM ESTUDIANTES_SQL;

/*
CASO #3: Mostrar Información (Con filtros)
ESTRUCTURA:
SELECT <<* ó nombres de las columnas>>
FROM <<Nombre Tabla>>
WHERE <<CONDICIONES>>
--
Donde una condición, tiene la siguiente estructura
<<columna 1>> = <<valor 1>>  ( =  Operador de igualdad)
<<columna 2>> > <<valor 2>>  ( <  menor que, <= menor o igual)
<<columna 2>> < <<valor 2>>  ( >  mayor que, >= mayor o igual)
<<columna 2>> <> <<valor 2>> ( <> diferente de)
--
En caso de varias condiciones, tambien se pueden agrupar o tener varias condiciones
<<condicion 1>> AND <<condicion 2>> (Condicion 1 y condicion 2 se deben cumplir)
<< condicion 1>> OR <<condicion 2>> (o la condicion o la condicion 2 se deben cumplir)
(<<condicion 1>> OR <<condicion 2>>) AND <<condicion 3>>
*/

SELECT *
FROM ESTUDIANTES_SQL
WHERE EDAD <= 18 AND GENERO = 'F';

/*
CASO 4: (Ordenar datos)
SELECT <<* ó columnas>>
FROM <<Nombre Tabla>>
WHERE <<condiciones>> (opcionales)
ORDER BY <<columna 1>> [ASC | DESC], <<columna 2>> [ASC | DESC]
NOTA:
- Si no se especifica que el orden sea ASC o DESC, se sobre-entiende como ASC
*/
SELECT *
FROM ESTUDIANTES_SQL
ORDER BY NOMBRE ASC, APELLIDO DESC;

SELECT *
FROM ESTUDIANTES_SQL
ORDER BY EDAD;

-- ACTUALIZAR REGISTROS EN UNA TABLA
/*
Estructura:
UPDATE <<Nombre Tabla>>
SET <<columna 1>> = <<valor 1>>, <<columna x>> = <<valor x>>
WHERE <<condicion(es)>> (opcional, si no se espeficica una condicion, se modifican TODOS los registros de la tabla)
*/

UPDATE ESTUDIANTES_SQL
SET CURSO_ACTUAL = 'Ciclo 2 Java'
WHERE GENERO = 'F';

SELECT *
FROM ESTUDIANTES_SQL;

-- ELIMINAR REGISTROS DE UNA TABLA
/*
ESTRUCTURA:
DELETE FROM <<Nombre Tabla>>
WHERE <<condicion(es)>> (opcional)
--
!!! NOTA IMPORTANTE!!!
- CUANDO SE VAYA A HACER ELIMINACION DE DATOS, HACER UNA COPIA DE SEGURIDAD DE LA BD
- NO SE OLVIDEN DE PONER EL WHERE EN EL DELETE FROM, Solo cuando se quiere eliminar todas las filas, es que no se coloca una condición
*/
SELECT *
FROM ESTUDIANTES_SQL;

DELETE FROM estudiantes_SQL
WHERE nombre = 'Tomas' AND ApElLiDo = 'Arrieta';