/**
* CalculadoraIVA
*
* @author Alejandro Ramos Román
*/

public class CalculadoraIVA {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una base imponible ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * 1.21);

  
    System.out.printf("El total de la factura es %.2f ",total);   
  } 
}
