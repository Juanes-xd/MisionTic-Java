# Clase 5

## Temas
...

## Ejercicio en clase
- Descargar el codigo de la clase 4 (Veterinaria)
- A la clase Perro, hacer las siguientes modificaciones:
    - Crear una variable statica que lleve el conteo de todos los perros creados hasta el momento
    - Añadir un atributo ***id*** que sea el identificador unico de cada perro.
        - Este debe ser secuencial.
        - NO se puede modificar (osea, privado)
        - Se puede consultar (osea, con un getter)
    - Añadir un constructor que reciba como parametro el nombre del perro y el sexo.
    - Añadir un constructor que reciba como parametro el nombre, el sexo y la raza del perro.
    - El atributo de sexo no se puede cambiar una vez asignado (debe ser privado y ser consultado usando un getter)
    - El atributo sexo debe estar restrigido para que solo pueda tener el valor MACHO o HEMBRA
    - El color del perro, debe estar restrigido a los siguientes colores: Blanco, Negro, Cafe, Amarillo, Hueso, Pardo
    - Añador un atributo ***color_secundario*** que indica que el perro tiene 2 colores. Getter y setter, estos son los valores validos:
    "Sin color secundario" y todos los valores validos del color principal 
    - Añador un atributo ***color_manchas*** que indica si el perro tiene machas y de que color son. Getter y setter, estos son los valores validos:
    "Sin manchas" y todos los valores validos del color principal
    - Añadir más información a la función de obtener info.
- Añadir al menu las siguientes opciones:
    1. Registrar un perrito:
        - Esto ya existe, en su mayoria solo es llamarla con los constructores adecuados
    1. Actualizar info de un perrito:
        - Recibir como entrada el id del perro
        - Buscar el perro en el arreglo de perros:
            - un for que recorre todos los perros
                - un if que pregunta si el id del perro es igual al id ingresado 
                - cuando sea igual:
                    - Preguntar que quiere actualizar (Nombre, año de nacimiento, el pedigree, si está castrado o no)
                - Si al finalizar no encontré al perro:
                    - Mostrar un mensaje "No tenemos a ese perro"
        - Actualizar la informacion
    1. Borrar un perrito
        - Recibir como entrada el id del perro
        - Buscar el perro en el arreglo de perros:
            - un for que recorre todos los perros
                - un if que pregunta si el id del perro es igual al id ingresado 
                - cuando sea igual:
                    - guardar la ubicación en una variable temporal
                - Si al finalizar no encontré al perro:
                    - Mostrar un mensaje "No tenemos a ese perro"
                - Validar si lo encontró o no. si lo encontró:
                    - Borrarlo:
                        - 
        - Actualizar la informacion
    1. Mostras una lista con todos mis perritos
        - Mostrar al menos:
            - id
            - nombre
            - raza
    1. Mostrar información detallada de un perrito en concreto:
        - Recibir como entrada el id del perro
        - Buscar el perro en el arreglo de perros:
            - un for que recorre todos los perros
                - un if que pregunta si el id del perro es igual al id ingresado 
                - cuando sea igual:
                    - mostrar toda la información del perro<>
    1. Salir
            