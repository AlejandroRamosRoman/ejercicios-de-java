/**
* Cuantos Euros se ganan en una semana
*
* @author Alejandro Ramos Román
*/

public class HorasSem {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el número de horas trabajadas "); 
    System.out.print("en una semana ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    int total;
    total = (primerNumero * 12);

  
    System.out.printf("El total de euros es " + total);   
  } 
}
