Proceso NumerosImparesMientras
    Definir i Como Entero
    i = 1
	
    // Usamos un ciclo MIENTRAS para recorrer los números del 1 al 30
    Mientras i <= 30 Hacer
        // Verificamos si el número es impar
        Si i % 2 <> 0 Entonces
            Escribir "Número impar: ", i
        FinSi
        i = i + 1  // Incrementar el contador
    FinMientras
FinProceso
