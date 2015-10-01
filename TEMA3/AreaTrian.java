/**
* Area de un triangulo
*
* @author Alejandro Ramos Román
*/

public class AreaTrian {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una base: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("introduce una altura: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * segundoNumero / 2);

  
    System.out.print("El area del triangulo es ");
    System.out.print(total);   
  } 
}
