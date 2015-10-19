/**
 *Ejercicio 9: Realiza un programa que nos diga cuántos dígitos tiene un número
 *introducido por teclado.
 *
 *@author José A. Arroyo
 */
 
public class Ejemplo {
  public static void main (String[] args){
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int contador = 0;
    
    System.out.print("El número " + numero);
    
    do{
      numero /= 10;
      contador++;
    }while(numero > 0);
    
    System.out.print(" tiene " + contador + " digitos.");
  }
}
