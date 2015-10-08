/**
* Ecuación de segundo grado
*
* @author Alejandro Ramos Román
*/

public class Ejer9Tema4Def {
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

    System.out.print("Por favor, introduce un valor para c ");
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble( linea );
    
    if (((b*b)-(4*a*c)) <= 0)  {
      System.out.println("los valores de la ecuación no son validos ");
    }
    
    
    
    else {
      System.out.println("El 1º valor de x es " + ((Math.sqrt(b*b-4*a*c)-b)/(2*a)));
    
      System.out.println("El 1º valor de x es " + ((-(Math.sqrt(b*b-4*a*c))-b)/(2*a)));
    
    } 
  }
}
