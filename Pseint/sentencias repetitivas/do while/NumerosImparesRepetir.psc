Proceso NumerosImparesRepetir
    Definir i Como Entero
    i = 1
	
    // Usamos un ciclo REPETIR para recorrer los n�meros del 1 al 30
    Repetir
        // Verificamos si el n�mero es impar
        Si i % 2 <> 0 Entonces
            Escribir "N�mero impar: ", i
        FinSi
        i = i + 1  // Incrementar el contador
    Hasta Que i > 30
FinProceso
