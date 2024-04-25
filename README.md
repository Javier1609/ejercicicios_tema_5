ENLACE A LOS EJERCICIOS 

https://github.com/Javier1609/ejercicicios_tema_5.git

EJERCICIOS EXPLICADOS 

1. Suma de los n primeros números naturales:
   - Crear una función recursiva que tome un número entero n como argumento.
   - Si n es igual a 0, devolver 0.
   - De lo contrario, devolver n más el resultado de la función llamada con n-1.

2. Imprimir la lista de números naturales entre dos valores:
   - Crear una función recursiva que tome dos números enteros a y d como argumentos.
   - Si a es mayor que d, no hacer nada.
   - De lo contrario, imprimir a y llamar a la función con a+1 y d.

3. Cantidad de dígitos de un número entero:
   - Crear una función recursiva que tome un número entero n como argumento.
   - Si n es menor que 10, devolver 1.
   - De lo contrario, devolver 1 más el resultado de la función llamada con n/10.

4. Calcular x^y mediante multiplicaciones sucesivas:
   - Crear una función recursiva que tome dos números enteros x y y como argumentos.
   - Si y es igual a 0, devolver 1.
   - De lo contrario, devolver x multiplicado por el resultado de la función llamada con x y y-1.

5. Valor máximo de un vector:
   - Crear una función recursiva que tome un vector y un índice como argumentos.
   - Si el índice es igual a la longitud del vector, devolver el valor mínimo de int.
   - De lo contrario, devolver el máximo entre el elemento del vector en el índice y el resultado de la función llamada con el vector y el índice+1.

6. Valor decimal de una cadena hexadecimal:
   - Crear una función recursiva que tome una cadena y un índice como argumentos.
   - Si el índice es igual a la longitud de la cadena, devolver 0.
   - De lo contrario, convertir el carácter en el índice a su valor decimal y sumarlo al resultado de la función llamada con la cadena y el índice+1, multiplicado por 16.

7. Calcular C(n, k):
   - Crear una función recursiva que tome dos números enteros n y k como argumentos.
   - Si n es igual a k o k es igual a 0, devolver 1.
   - De lo contrario, devolver la suma de la función llamada con n-1 y k, y la función llamada con n-1 y k-1.

8. Contar genes en una cadena de ADN:
   - Crear una función recursiva que tome una cadena y un índice como argumentos.
   - Si el índice es mayor o igual a la longitud de la cadena menos 3, devolver 0.
   - De lo contrario, si los tres caracteres en el índice son "ATG", sumar 1 al resultado de la función llamada con la cadena y el índice+3.
   - Si no, llamar a la función con la cadena y el índice+1.

9. Ordenar las líneas de un archivo de texto:
   - Leer todas las líneas del archivo en una lista.
   - Ordenar la lista.
   - Escribir las líneas ordenadas en un nuevo archivo.

10. Buscar una palabra en un archivo de texto:
    - Leer todas las líneas del archivo en una lista.
    - Para cada línea, dividirla en palabras y buscar la palabra dada.
    - Si se encuentra la palabra, imprimir la línea.

11. Buscar una palabra en un archivo de texto con búsqueda binaria:
    - Leer todas las líneas del archivo en una lista.
    - Dividir cada línea en palabras y agregar todas las palabras a una lista.
    - Ordenar la lista de palabras.
    - Realizar una búsqueda binaria en la lista ordenada para encontrar la palabra dada.

12. Introducir fechas y listarlas en orden cronológico:
    - Pedir al usuario que introduzca el número de fechas que desea ingresar.
    - Para cada fecha, pedir al usuario que la introduzca y añadirla a una lista.
    - Ordenar la lista de fechas.
    - Imprimir las fechas en orden cronológico.

13. Optimizar la implementación del algoritmo quicksort:
    - Implementar la técnica de "median of three" para seleccionar el pivote.
    - Modificar la función de partición para mover los elementos menores que el pivote a la izquierda y los elementos mayores que el pivote a la derecha.
