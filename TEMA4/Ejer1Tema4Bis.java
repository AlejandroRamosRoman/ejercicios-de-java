/**
 * Asignatura a primera
 *
 * @author Alejandro Ramos Román
 */

public class Ejer1Tema4Bis {
  public static void main(String[] args) {
  
    System.out.println(" Asignatura a primera hora");
    System.out.println(" ----------------");
    System.out.println(" 1. Lunes");
    System.out.println(" 2. Martes");
    System.out.println(" 3. Miercoles");
    System.out.println(" 4. Jueves");
    System.out.println(" 5. Viernes");
    System.out.println(" 6. Sabado");
    System.out.println(" 7. Domingo");
    System.out.print("\n Elija una opción (1-7): ");
  
    int opcion = Integer.parseInt(System.console().readLine());

    
    switch (opcion) {
      case 1:
        System.out.print("\nFOL ");
        break;
        
      case 2:
        System.out.print("\nPROG ");
        break;
        
      case 3:
        System.out.print("\nSIN ");
        break;
        
      case 4:
        System.out.print("\nPROG ");
        break;
        
      case 5:
        System.out.print("\nBBDD ");
        break;
        
      case 6:
        System.out.print("\ndescansa, es fin de semana ");
        break;
        
      case 7:
        System.out.print("\ndescansa, es fin de semana ");
        break;
      
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
