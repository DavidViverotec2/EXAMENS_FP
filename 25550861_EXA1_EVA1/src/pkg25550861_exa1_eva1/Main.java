package pkg25550861_exa1_eva1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double nat,cic,carr,total;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("TRIATLON");
        System.out.print("Ingrese en cuantos minutos termino la natación: ");
        nat = entrada.nextDouble();
        
        System.out.print("Ingrese en cuantos minutos termino el ciclismo: ");
        cic = entrada.nextDouble();
        
        System.out.print("Ingrese en cuantos minutos termino de correr: ");
        carr = entrada.nextDouble();
        
        total = nat + cic + carr;
        
        if (total < 120){ 
            if (nat < 60 && cic < 60 && carr < 60) { 
                System.out.println("Claficicación: Excelente"); 
            }else { 
                System.out.println("Clasificación: Regular");}
        }if (total < 150 || (nat < 70 && cic < 70 && carr < 70)) {
            System.out.println("Clasificación: Buena");}
        else {
            System.out.println("Clasificacion: Regular");}
        
    }   
}
