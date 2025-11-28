package eva2_examen_25550861;

import java.util.Scanner;

public class EVA2_EXAMEN_25550861 {
    public static void main(String[] args) {
        int numero,desicion;
        Scanner entrada = new Scanner(System.in);
        
        do{
        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();
        
        System.out.print("¿Quiere imprimir los numeros primos (1) o no primos (2)? (0 para salir) ");
        desicion = entrada.nextInt();
        
        if (desicion == 1) { // Si la desicion es 1
            for (int i = 2; i <= numero;i++) { // Reproduce hasta llegar al numero de entrada
                int contador = 0; // Creamos el contador
                    for (int j = 1; j <= i; j++) { // Me reproduce hasta llegar al numero
                        if (i % j == 0) { // Si el residuo entre el numero y el indice es cero
                            contador++; // si es divisible, lo aumentamos en el contador
                        }
                        
                    } 
                    
                    

                    // Un número primo solo tiene dos divisores: 1 y él mismo
                    if (contador == 2) { // Si tiene solo 2 divisores 
                        System.out.print(i + ""); // Es primo
                        for (int x = 1; x <= i ; x++) {  // Controla las filas, el indice debe ser menor o igual al valor que da el usuario   
                                System.out.print("*");       // Se utiliza el print para imprimir en la misma fila mientras j sea menor a la fila
                                      
                        }
                        System.out.println("");
                    }

        }
        }   else if(desicion == 2){
                    
                    for (int i = 2; i <= numero;i++) { // Reproduce hasta llegar al numero de entrada
                        int contador = 0; // Creamos el contador
                        for (int j = 1; j <= i; j++) { // Me reproduce hasta llegar al numero
                            if (i % j == 0) { // Si el residuo entre el numero y el indice es cero
                                contador++; // si es divisible, lo aumentamos en el contador
                            }

                        } 



                        if (contador != 2) { // Si tiene solo 2 divisores 
                        System.out.print(i + ""); // No es primo
                        for (int x = 1; x <= i ; x++) {  // Controla las filas, el indice debe ser menor o igual al valor que da el usuario   
                                System.out.print("*");       // Se utiliza el print para imprimir en la misma fila mientras j sea menor a la fila
                                      
                        }
                        System.out.println("");
                    }

            }
        }
        
        } while(desicion != 0);
    }
    
}
