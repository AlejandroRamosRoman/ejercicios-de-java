/**
* Calcula una multiplicacion de dos numeros
*
* @author Alejandro Ramos Román
*/

public class MultiplicaNumeros {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("ahora introduce otro: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    Double total;
    total = (primerNumero * segundoNumero);

  
    System.out.print("la multiplicación es ");
    System.out.print(total);   
  } 
}
