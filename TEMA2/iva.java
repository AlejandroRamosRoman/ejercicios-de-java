/**
 * Convertidor de pesetas a euros
 *
 * @author Alejandro Ramos Román
 */

public class iva {
  public static void main(String[] args) {
    double baseimponible; // Se declara la variable base imponible
    double IVA; // Se declara la variable IVA
  
    baseimponible = 500;
    
    System.out.printf("el resultado es " + (baseimponible * 1.21) + "euros");
    
    }
}
