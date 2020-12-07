
package Principal;


public class Operadores 
{

    
    public static void main(String[] args) 
    {
        
        int n= 3,a = 2*n++; 
        System.out.println(a); 
        n= 3;
        
        a = 2*++n;
        System.out.println(a); 
        System.out.println((int)Math.pow(3, 2));
        
        String numero = "1526";
        int resultado = Integer.valueOf(numero) + 4;// o Integer.ParseInt
        
        System.out.println("la suma de la cadena es: "+ resultado);
        
        String nombre = "Pedro";
        if (nombre.substring(0, 3) == "Ped")//no se puede comparar las cadenas con '=='
        {
            System.out.println("true");        
        }else
        {
            System.out.println("false");
        }
        double precio = 25.4;
        System.out.printf("$");
        System.out.printf("%6.2f", precio);
        System.out.printf(" unidad");        
    }
    
}
