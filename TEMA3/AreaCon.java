/**
* Area de un cono
*
* @author Alejandro Ramos Román
*/

public class AreaCon {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un radio: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("introduce una altura: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * primerNumero * 3.14 * segundoNumero / 3);

  
    System.out.print("El area del cono es ");
    System.out.print(total);   
  } 
}
