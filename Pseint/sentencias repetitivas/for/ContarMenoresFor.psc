Proceso ContarMenoresFor
    contador <- 0
	
    // Bucle PARA para leer 10 números
    Para i <- 1 Hasta 10 Hacer
        Escribir "Ingresa un número: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el número es menor que 50
        FinSi
    FinPara
	
    Escribir "Cantidad de números menores a 50: ", contador
FinProceso
