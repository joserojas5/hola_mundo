package Principal;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class CondicionalesJava 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        //usando la condicionas if - else
        /*int numDeAlumnos;
        System.out.println("Ingrese la cantidad de alumnos : ");
        numDeAlumnos = sc.nextInt();
        
        if (numDeAlumnos <= 100)
        {
            System.out.println("Menos de 100 alumnos");
        }else
        {
            if(numDeAlumnos <= 500)
            {
                System.out.println("Entre 100 y 500 alumnos");          
            }else
            {
                System.out.println("Mas de 500 alumnos");
            }
        }*/
        
        //usando la condicional switch
        int nivelProf;
        System.out.println("Ingrese su numero de profesion (1-3):");
        nivelProf = sc.nextInt();
        switch (nivelProf)
        {
            case 1:
                System.out.println("Amateur");
                break;
            case 2:
                System.out.println("Intermedio");
                break; 
            case 3:
                System.out.println("Profesional");
                break;
            default:    
                System.out.println("Desconocido");
        }
    }
    
}
