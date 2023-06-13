package recursividad2023s1;

import java.util.Scanner;

/**
 * Estructuras de Datos En Línea - 2023-S1 16.18
 * Recursividad
 * @author Gabriel Eduardo Morejón López
 */
class Recursividad {
    void imprimirA(int x) {
        System.out.println(x);
        imprimirA(x);
    }
    
    void imprimirB(int x) {
        if (x>0) {
            System.out.println(x);
            imprimirB(x-1);
        }
    }
    
    void imprimirC(int x) {
        if (x>0) {
            imprimirC(x-1);
            System.out.println(x);
        }
    }
    
    int factorialA(int n) {
        if (n>0) {
            int valor = n * factorialA(n-1);
            return valor;
        } else
            return 1;
    }
    
    int factorialB(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorialB(n-1);
    }
    
    int longitudCadena(String cadena) {
        if (cadena == null || cadena.isEmpty()) 
            return 0;
        else
            return 1 + longitudCadena(cadena.substring(1));
    }
    
    void imprimirCaracteres(String cadena) {
        if (cadena == null || cadena.isEmpty()) { // return; // Retorna
        } else {
            System.out.println(cadena.charAt(0));
            imprimirCaracteres(cadena.substring(1));
        }
    }
    
    void imprimirCaracteresRev(String cadena) {
                if (cadena == null || cadena.isEmpty()) { // return; // Retorna
        } else {
            imprimirCaracteresRev(cadena.substring(1));
            System.out.println(cadena.charAt(0));
            
        }
    }
    
    double potencia(double n, int exp) {
        if (exp == 0) 
            return 1;
        else
            return n * potencia(n, exp - 1);
    }
    
    // Máximo Común divisor
    double mcd(int m, int n) {
        if (m % n == 0) 
            return n;
        else
            return mcd(n, m % n);
    }
    
}

public class Recursividad2023S1 {

    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Ejercicio de Recursividad.");
        Recursividad r =  new Recursividad();
        
        String cadena = "Hola";
        
        //r.imprimirA(6);
        //r.imprimirB(6);
        //r.imprimirC(6);
        int n=5;
        System.out.println("Factorial de n - algoritmo1: " + r.factorialA(n));
        System.out.println("Factorial de n - algoritmo2: " + r.factorialB(n));
        
        System.out.println("Longitud de la cadena: " + r.longitudCadena(cadena));
        /*r.imprimirCaracteres(cadena);
        r.imprimirCaracteresRev(cadena);*/
        
        System.out.print("Ingrese un nro: ");
        double nro = dato.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int expo = dato.nextInt();
        
        System.out.println("Potencia de x^n: " + r.potencia(nro, expo));
        
        System.out.println("MCD de x - n: " + r.mcd(16, 4));
    }
}
