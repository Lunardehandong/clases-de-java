Proceso ContarMenoresFor
    contador <- 0
	
    // Bucle PARA para leer 10 n�meros
    Para i <- 1 Hasta 10 Hacer
        Escribir "Ingresa un n�mero: "
        Leer numero
        
        Si numero < 50 Entonces
            contador <- contador + 1 // Contar si el n�mero es menor que 50
        FinSi
    FinPara
	
    Escribir "Cantidad de n�meros menores a 50: ", contador
FinProceso
