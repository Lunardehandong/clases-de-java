Proceso ContarMenoresWhile
    contador <- 0
    i <- 1
	
    // Bucle MIENTRAS para leer 10 n�meros
    Mientras i <= 10 Hacer
        Escribir "Ingresa un n�mero: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el n�mero es menor que 50
        FinSi
        
        i <- i + 1
    FinMientras
	
    Escribir "Cantidad de n�meros menores a 50: ", contador
FinProceso
