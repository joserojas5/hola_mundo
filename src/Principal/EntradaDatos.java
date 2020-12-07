
package Principal;
import java.util.*;

public class EntradaDatos 
{

    
    public static void main(String[] args) 
    {
        //crear un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es su nombre?");
        String nombre = sc.nextLine();
        System.out.println("¿Cual es su edad?");        
        int edad = sc.nextInt();
        
        System.out.println("Buenos dias!!, " +nombre + ", tiene una edad: "+ edad );
        
        System.out.println("Ingrese dos numeros: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double suma = a+b;
        System.out.println("la suma de los numero es: "+ suma);
        
        
    }
    
}
