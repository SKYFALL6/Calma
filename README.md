# Calma
si no se pudo ayer se pudo hoy
Todo saldra bien
declare  una constante para el número máximo de términos que queria calcular.
 Inicie las dos primeras variables de la serie de Fibonacci.
NumeroInicial es el primer número de la secuencia, comenzando en 0.
NumeroSiguiente es el segundo número de la secuencia, comenzando en 1.
Declare una variable para almacenar el resultado de cada suma en la secuencia.
Imprimi los dos primeros números de la secuencia separados por una coma.
Comence el ciclo for desde 2, ya que los primeros dos términos ya han sido impresos.
Calcule el siguiente número en la secuencia sumando los dos números anteriores.
Imprimi el siguiente número de la secuencia,  por una coma.
Actualice los valores de NumeroInicial y NumeroSiguiente para el siguiente ciclo.
El número actual pasa a ser el "anterior" para la siguiente iteración.
El número recién calculado pasa a ser el "siguiente" para la próxima iteración.

//fizzbuzz
Definimos una constante que representa el número máximo hasta el cual el programa iterará.
Inicie un bucle for que recorrerá los números del 1 al valor de NUMERO_MAXIMO (100).
Si el número actual es divisible por 3 y por 5 (múltiplo de 15), imprimimos "fizzbuzz".
Si el número actual es divisible solo por 3, imprimimos "fizz".
Si el número actual es divisible solo por 5, imprimimos "buzz".
Si el número no es divisible ni por 3 ni por 5, imprimimos el número.

//numeros primos :D
Definimos una constante que representa el número máximo hasta el cual el programa verificará si los números son primos.
Imprimi un mensaje inicial indicando que se mostrarán los números primos entre 1 y 100.
Inicie un bucle for que recorrerá todos los números desde 2 hasta el valor de NUMERO_MAXIMO (100).
Declare un contador para contar cuántos divisores tiene el número actual (i).
Inicie otro bucle for que verifica si el número actual (i) es divisible por algún número entre 2 y i-1.
Si se encuentra un divisor (i % j == 0), incrementamos el contador de divisores y salimos del bucle con break.
Si el contador de divisores sigue siendo 0, entonces el número es primo y lo imprimimos.