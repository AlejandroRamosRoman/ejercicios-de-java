/**
 *Combinación de caja fuerte, clave de 4 digitos y 4 oportunidades
 *
 * @author Alejandro Ramos Román
 */

public class Ejer7Tema5 {
  
  public static void main(String[] args) {
  
    int clave = 2015;
    int contador = 0;
    int contraseña;
    
    do {
    System.out.println("por favor, introduzca la contraseña:   ");
    contraseña= Integer.parseInt(System.console().readLine());
    
    if (contraseña == clave) {// esta es la contraseña
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    }else{
          System.out.println("Lo siento, esa no es la combinación");
         
        contador++;
    }
  }while ((clave != contraseña) && (contador < 4));
    
  } 
}


