/**
 * Horoscopo
 *
 * @author Alejandro Ramos Román
 */

public class Ejer10Tema4Bis {
  public static void main(String[] args) {
  
    System.out.println(" Horoscopo");
    System.out.println(" ----------------");
    System.out.println(" 1. Enero");
    System.out.println(" 2. Febrero");
    System.out.println(" 3. Marzo");
    System.out.println(" 4. Abril");
    System.out.println(" 5. Mayo");
    System.out.println(" 6. Junio");
    System.out.println(" 7. Julio");
    System.out.println(" 8. Agosto");
    System.out.println(" 9. Septiembre");
    System.out.println(" 10. Octubre");
    System.out.println(" 11. Noviembre");
    System.out.println(" 12. Diciembre");
    
    System.out.print(" Elija un mes (1-12): ");

    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print(" Elija un dia (1-31): ");

    int dia = Integer.parseInt(System.console().readLine());
  
    
     if (((mes ==1) && (dia >=21) && (dia <=31))  || ((mes ==2) &&  (dia <=21))) {
      System.out.println(" Tu horoscopo es Acuario");
      }
      
     if (((mes ==2) && (dia>=22) && (dia <=28)) || ((mes ==3) && (dia <=20))) {
      System.out.println(" Tu horoscopo es Piscis");
      }
     
     if (((mes ==3) && (dia>=21) && (dia <=30)) || ((mes ==4) && (dia <=19))) {
      System.out.println(" Tu horoscopo es Aries");
      }
      
     if (((mes ==4) && (dia>= 19) && (dia <=31)) || ((mes ==5) && (dia <=20))) {
      System.out.println(" Tu horoscopo es Tauro");
      }
     
     if (((mes ==5) && (dia >=21) && (dia <=30)) || ((mes ==6) && (dia <=21))) {
      System.out.println(" Tu horoscopo es Geminis");
      }
     
     if (((mes ==6) && (dia >=21) && (dia <=30)) || ((mes ==7) && (dia >=22))) {
      System.out.println(" Tu horoscopo es Cancer");
      }
      
     if (((mes ==7) && (dia >=23) && (dia <=31)) || ((mes ==8) && (dia <=22))) {
      System.out.println(" Tu horoscopo es Leo");
      }
 
     if (((mes ==8) && (dia >=24) && (dia <=31)) || ((mes ==9) && (dia <=22))) {
      System.out.println(" Tu horoscopo es Virgo");
      }
         
     if (((mes ==9) && (dia >=23) && (dia <=30)) || ((mes ==10) && (dia <=22))) {
      System.out.println(" Tu horoscopo es Libra");
      }
      
     if (((mes ==10) && (dia >=23) && (dia <=31)) || ((mes ==11) && (dia <=21))) {
      System.out.println(" Tu horoscopo es Escorpio");
      }
     
     if (((mes ==11) && (dia >=22) && (dia <=30)) || ((mes ==12) && (dia <=21))) {
      System.out.println(" Tu horoscopo es Sagitario");
     }
     
     if (((mes ==12) && (dia >=21) && (dia <=31)) || ((mes ==1) && (dia <=21))) {
      System.out.println(" Tu horoscopo es Capricornio");
      }
      
       else {
        System.out.println("Lo siento, ese dia no existe.");
        }
    }
}
