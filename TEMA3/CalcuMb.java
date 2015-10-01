/**
* Calcula de Kb a Mb
*
* @author Alejandro Ramos Román
*/

public class CalcuMb {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una cantidad de Kb: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero / 1024);

    System.out.print("la cantidad de Mb es  ");
    System.out.print(total);   
  } 
}
