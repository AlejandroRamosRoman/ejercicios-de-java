/**
 * Ejercicio 10 del tema 5
 * media de números
 *
 * @author Alejandro
 */
 
 public class Ejer10Tema5 {
  
  public static void main(String[] args) {
  
  int contador = 0;
  int suma = 0;
   
  System.out.println("Dime un número: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  if (numero < 0){
    System.out.println("El numero debe ser positivo");
    }else{
       do{       
      System.out.println("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      
      if (numero<0){
        System.out.println("La media de los numeros es "+ (suma/contador));
        }
        suma = suma + numero;
        contador++;
     }while ( numero >= 0);
      
      } 
    }
  }
