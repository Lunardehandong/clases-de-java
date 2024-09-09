Proceso OperacionesMatematicas
    Escribir "Ingresa el número de la operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División): "
    Leer operacion
    Escribir "Ingresa el primer número: "
    Leer num1
    Escribir "Ingresa el segundo número: "
    Leer num2
    
    Segun operacion Hacer
        Caso 1:
            Escribir "Resultado: ", num1 + num2
        Caso 2:
            Escribir "Resultado: ", num1 - num2
        Caso 3:
            Escribir "Resultado: ", num1 * num2
        Caso 4:
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
            SiNo
                Escribir "No se puede dividir por cero."
            FinSi
        De Otro Modo:
            Escribir "Operación no válida."
    FinSegun
FinProceso
