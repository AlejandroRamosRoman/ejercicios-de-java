/**
 * Ordenar números
 *
 * @author Alejandro Ramos Román
 */

public class Ejer13Tema4 {
  public static void main(String[] args) {
    
     int A1;
     int A2;
     int A3;
     
    System.out.print(" Elija un número entero: ");

    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print(" Elija un segundo número entero: ");

    int b = Integer.parseInt(System.console().readLine());
    
     System.out.print(" Elija el último número entero: ");

    int c = Integer.parseInt(System.console().readLine());
    
   
    
    if ((a>b) && (a>c)) {
      A1 = a;
      }
    if ((b>a) && (b>c)) {
      A1 = b;
      }
    if ((c>b) && (c>a)) {
      A1 = c;
      }
    if ((a<b) && (a>c)) {
      A2 = a;
      }
    if ((b<a) && (b>c)) {
      A2 = b;
      }
    if ((c<a) && (c>b)) {
      A2 = c;
      }
    if ((a<b) && (a<c)) {
      A3 = a;
      }
    if ((b<a) && (b<c)) {
      A3 = b;
      }
    if ((c<b) && (c<a)) {
       A3 = c;
      }
    
      
     System.out.println("Los números introducidos ordenados de menor a mayor son " + A1  ", " + A2  " y " + A3 ); 
  }
}
    
   
   
