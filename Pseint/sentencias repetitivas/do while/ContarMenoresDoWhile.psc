Proceso ContarMenoresDoWhile
    contador <- 0
    i <- 1
	
    // Bucle REPETIR para leer 10 números
    Repetir
        Escribir "Ingresa un número: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el número es menor que 50
        FinSi
        
        i <- i + 1
		HastaQue i > 10
		
		Escribir "Cantidad de números menores a 50: ", contador
FinProceso
