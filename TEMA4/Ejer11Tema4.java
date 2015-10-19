/**
 * Cuantos segundos quedan para la medianoche
 * una noche tiene 86400 segundos
 *
 * @author Alejandro Ramos Román
 */

public class Ejer11Tema4 {
  public static void main(String[] args) {
  
    
    System.out.print(" Elija una hora: ");

    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print(" Elija los minutos por favor: ");

    int minutos = Integer.parseInt(System.console().readLine());
  
    int segundos;
    segundos = (86400-((hora*3600)+(minutos*60)));
    
     if ((segundos >=0) && (hora >=0) && (minutos >=0) && (minutos <60)) {
      System.out.println(" los segundos que quedan son: " + segundos);
      }
      
      else {
      System.out.println("Lo siento, te recuerdo que un dia tiene 24 horas y una hora tiene 60 minutos.");
      }
    }
}
