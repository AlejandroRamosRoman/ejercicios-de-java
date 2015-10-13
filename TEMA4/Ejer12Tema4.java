/**
 * Cuestionario
 *
 * @author Alejandro Ramos Román
 */

public class Ejer12Tema4 {
  public static void main(String[] args) {
    int punto= 0;
    
    System.out.print("¿Quien inventa la maquina de sumar?: ");
    String respuesta = System.console().readLine();
    if (respuesta.equals ("Blaise Pascal")) {
      punto++;
    }
    System.out.print("¿Quien es la profesora de Base de datos?: ");
    String respuesta1 = System.console().readLine();
    if (respuesta1.equals ("Eva")) {
      punto++;
    }
    System.out.print("¿Al ritmo de trabajo del procesador lo llamamos?: ");
    String respuesta2 = System.console().readLine();
    if (respuesta2.equals ("Frecuencia")) {
      punto++;
    }
    System.out.print("¿En que asignatura vemos Metrica3?: ");
    String respuesta3 = System.console().readLine();
    if (respuesta3.equals ("Entorno de desarrollo")) {
      punto++;
    }
    System.out.print("¿puede una clave primaria ser nula?: ");
    String respuesta4 = System.console().readLine();
    if (respuesta4.equals ("No")) {
      punto++;
    }
     
     System.out.println("Tus puntuación es " + punto + " puntos."); 
        
    }
  }
