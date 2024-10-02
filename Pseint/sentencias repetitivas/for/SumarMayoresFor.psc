Proceso SumarMayoresFor
    Definir suma Como Entero
    suma <- 0
    
    Para i Desde 1 Hasta 200 Hacer
        Escribir "Ingresa un número: "
        Leer numero
        suma <- suma + numero
        
        Si suma > 200 Entonces
            Romper // Detener el bucle si la suma es mayor a 200
        Fin Si
    Fin Para
    
    Escribir "La suma total es: ", suma
Fin Proceso
