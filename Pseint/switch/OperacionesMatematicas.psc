Proceso OperacionesMatematicas
    Escribir "Ingresa el n�mero de la operaci�n (1: Suma, 2: Resta, 3: Multiplicaci�n, 4: Divisi�n): "
    Leer operacion
    Escribir "Ingresa el primer n�mero: "
    Leer num1
    Escribir "Ingresa el segundo n�mero: "
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
            Escribir "Operaci�n no v�lida."
    FinSegun
FinProceso
