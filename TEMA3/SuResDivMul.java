/**
* Suma, resta, división y multiplicación
*
* @author Alejandro Ramos Román
*/

public class SuResDivMul {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    Double total1;
    total1 = (primerNumero * segundoNumero);
    System.out.println("La multiplicación del primer número por el segundo ");
    System.out.println(total1);   
       
    Double total2;
    total2 = (primerNumero + segundoNumero);
    System.out.println("La suma del primer número por el segundo ");
    System.out.println(total2);  
    
    Double total3;
    total3 = (primerNumero - segundoNumero);
    System.out.println("La resta del primer número por el segundo ");
    System.out.println(total3); 
    
    Double total4;
    total4 = (primerNumero / segundoNumero);
    System.out.println("La división del primer número por el segundo ");
    System.out.println(total4); 
    
      
  } 
}
