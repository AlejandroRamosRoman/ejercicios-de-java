/**
 * Días de la semana
 *
 * @author Alejandro Ramos Román
 */

public class Ejer3Tema4 {
  public static void main(String[] args) {
  
    System.out.println(" Escribe un número del 1 al 7");
  
    int opcion = Integer.parseInt(System.console().readLine());

    
    switch (opcion) {
      case 1:
        System.out.print("\nLunes ");
        break;
        
      case 2:
        System.out.print("\nMartes ");
        break;
        
      case 3:
        System.out.print("\nMiercoles ");
        break;
        
      case 4:
        System.out.print("\nJueves ");
        break;
        
      case 5:
        System.out.print("\nViernes ");
        break;
        
      case 6:
        System.out.print("\nSabado ");
        break;
        
      case 7:
        System.out.print("\nDomingo ");
        break;
      
        
      default:
        System.out.print("\nTe he dicho que pongas un número del 1 al 7");
    }
  }
}

  

