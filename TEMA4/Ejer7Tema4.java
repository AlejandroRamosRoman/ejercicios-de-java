/**
* Media de 3 notas
*
* @author Alejandro Ramos Román
*/

public class Ejer7Tema4 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la primera nota ");
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
    
    System.out.print("Por favor, introduce la segunda nota ");
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );
    
    System.out.print("Por favor, introduce la tercera nota ");
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble( linea );

    int total;
    

  
    System.out.printf("La media es " + ((a+b+c)/3));   
  } 
}
