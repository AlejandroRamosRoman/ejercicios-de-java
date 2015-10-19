/**
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Alejandro Ramos Román
 */

public class Ejer9Tema5 {

  public static void main(String[] args) {
                        
    
    int digitos = 0;
    int n;
    int numero;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numero = Integer.parseInt(System.console().readLine());
    
    n = numero;
    
    while (n >1) {
    n = n/10;
    digitos++;
    }
      System.out.println(digitos);
  }
}
  

