/**
* Calcula de Mb a Kb
*
* @author Alejandro Ramos Román
*/

public class CalcuKb {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una cantidad de Mb: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * 1024);

    System.out.print("la cantidad de kb es  ");
    System.out.print(total);   
  } 
}
