Proceso ContarMenoresDoWhile
    contador <- 0
    i <- 1
	
    // Bucle REPETIR para leer 10 n�meros
    Repetir
        Escribir "Ingresa un n�mero: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el n�mero es menor que 50
        FinSi
        
        i <- i + 1
		HastaQue i > 10
		
		Escribir "Cantidad de n�meros menores a 50: ", contador
FinProceso
