/**
 * Buenos días, Buenas tardes, Buenas noches
 *
 * @author Alejandro Ramos Román
 */

public class Ejer2Tema4 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce una hora de las 24 horas que tiene un dia: ");
    String linea = System.console().readLine();
    int x = Integer.parseInt( linea );

    if ((x >=6) && (x <=12)) {
      System.out.println("Buenos días.");
     } 
    if ((x >12) && (x <=20))  {
      System.out.println("Buenas tardes");
     }
    if ((x >20) && (x <24))   {
      System.out.println("Buenas noches");
     }
     if ((x >=0) && (x <6))  {
      System.out.println("Buenas noches");
     }
  
    if (x >=24)  {
      System.out.println("te has equivocado");  
     }
   }
  }
  

