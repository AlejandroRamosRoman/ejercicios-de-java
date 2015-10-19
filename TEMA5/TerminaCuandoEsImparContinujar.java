/**
 * Bucle do-while y escribir números pares o impares y que pida continuar
 * número impar.
 *
 * @author Alejandro
 */

public class TerminaCuandoEsImparContinujar {
    
  public static void main(String[] args) {
    
    String respuesta;    

      
    do {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
         
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      } else {
        System.out.println("El número impar, no me gusta");
      }
      System.out.println("¿Quieres continuar? s/n");
      respuesta = System.console().readLine();
    }  while (respuesta.equalsIgnoreCase("s")); 
  }
}
