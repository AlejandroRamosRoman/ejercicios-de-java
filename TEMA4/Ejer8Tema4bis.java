/**
* Suspenso, aprobado,bien, notable, sobresaliente.
*
* @author Alejandro Ramos Román
*/

public class Ejer8Tema4bis {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la primera nota ");
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
    
    System.out.print("Por favor, introduce la segunda nota ");
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble( linea );
    
    System.out.print("Por favor, introduce la tercera nota ");
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble( linea );

  
    System.out.printf("La media es " + ((a+b+c)/3));
    
    double x;
    x = Double.parseDouble( linea );
    x = ((a+b+c)/3);
    
    if (x <5) {
      System.out.println(" Insuficiente, tienes que estudiar más.");
     }  
     
    if ((x>=5) && (x<6)) {
      System.out.println(" Suficiente, por poco");
    }
    if ((x>=6) && (x<7)) {
      System.out.println(" Bien");
    }
    if ((x>=7) && (x<9)) {
      System.out.println(" Notable, buen trabajo");
    }
    if ((x>=9) && (x<=10)) {
      System.out.println(" Sobresaliente, enhorabuena");
    }
      
    
     
  } 
}
