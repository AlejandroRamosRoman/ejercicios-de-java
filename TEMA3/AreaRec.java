/**
* Area de un rectangulo
*
* @author Alejandro Ramos Román
*/

public class AreaRec {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una base: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("introduce una altura: ");
    linea = System.console().readLin();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * segundoNumero);

  
    System.out.print("El area del rectangulo es ");
    System.out.print(total);   
  } 
}
