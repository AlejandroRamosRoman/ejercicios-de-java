/**
* CalculadoraPta
*
* @author Alejandro Ramos Román
*/

public class CalculadoraPta {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una cantidad de pesetas: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero / 166.67);

  
    System.out.printf("El resultado en pesetas es %.2f ",total);   
  } 
}
