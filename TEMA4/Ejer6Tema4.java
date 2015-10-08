/**
* Calcula el tiempo en caer un objeto, sabiendo la altura.
*
* @author Alejandro Ramos Román
*/

public class Ejer6Tema4 {
  public static void main(String[] args) {

    String linea;
    
    System.out.print("Por favor, introduce un valor para h ");
    linea = System.console().readLine();
    double h;
    h = Double.parseDouble( linea );
    
    
    if (h == 0)  {
      System.out.println("la altura no puede ser 0");
    }
    
    else {
    
     System.out.println("El resultado de t es: " + (Math.sqrt(2*h/9.81)));   Math.sqrt
    } 
 }
}
