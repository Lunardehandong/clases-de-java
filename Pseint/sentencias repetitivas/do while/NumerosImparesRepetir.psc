Proceso NumerosImparesRepetir
    Definir i Como Entero
    i = 1
	
    // Usamos un ciclo REPETIR para recorrer los números del 1 al 30
    Repetir
        // Verificamos si el número es impar
        Si i % 2 <> 0 Entonces
            Escribir "Número impar: ", i
        FinSi
        i = i + 1  // Incrementar el contador
    Hasta Que i > 30
FinProceso
