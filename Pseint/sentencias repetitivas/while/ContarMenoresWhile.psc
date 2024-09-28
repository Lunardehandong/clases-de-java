Proceso ContarMenoresWhile
    contador <- 0
    i <- 1
	
    // Bucle MIENTRAS para leer 10 números
    Mientras i <= 10 Hacer
        Escribir "Ingresa un número: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el número es menor que 50
        FinSi
        
        i <- i + 1
    FinMientras
	
    Escribir "Cantidad de números menores a 50: ", contador
FinProceso
