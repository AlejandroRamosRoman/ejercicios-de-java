/**
* Cuantos Euros se ganan en una semana
*
* @author Alejandro Ramos Román
*/

public class Ejer4Tema4 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el número de horas trabajadas "); 
    System.out.print("en una semana ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    int total;
    
    if (primerNumero <=40)
     total = (primerNumero * 12);
    
    else 
    total = ((40*12)+((primerNumero-40)*16));

  
    System.out.printf("El total de euros es " + total);   
  } 
}
