/**
* Ecuación de primer grado
*
* @author Alejandro Ramos Román
*/

public class Ejer5Tema4 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un valor para a ");
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
    
    System.out.print("Por favor, introduce un valor para b ");
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );

    

  
    System.out.printf("El valor de x es " + (-b/a));   
  } 
}
