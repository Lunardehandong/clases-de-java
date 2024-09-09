Proceso VerificarNumero
    Definir numero Como Entero
    
    Escribir "Ingresa un número:"
    Leer numero
    
    Si numero > 0 Entonces
        Escribir "El número es positivo."
    Sino
        Si numero < 0 Entonces
            Escribir "El número es negativo."
        Sino
            Escribir "El número es cero."
        FinSi
    FinSi
FinProceso
