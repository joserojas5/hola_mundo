
package Principal;

public class Variables 
{
public static final double dolar = 3.89;//constante para toda la clase
    
    public static void main(String[] args) 
    {
        int numeroAlumnos = 50, ultimoAlumno, numeroDeGrupo = 40;
        ultimoAlumno = 30;
        numeroAlumnos %= 3;// MOD
        final float pi = 3.1425F;// contasntes(no cambia el valor)
        float area;
        double radio = 2.5;
        
        area = (pi/2) * (((float)radio)*(float)radio);// los valores de una operacion tienen que ser del mismo tipo 
        //que en el valor que se va a insertar el resultado
        System.out.println(numeroAlumnos +" "+ultimoAlumno);
        System.out.println("Area es: "+ area);
        double soles = 8;
        //impresion del metodo estatico de conversion
        System.out.println("la convesion de Soles a dolas es: "+ ConversionDolar(soles));
        //declaracion de objeto de la clase
        Variables obj = new Variables();
        System.out.println("la convesion de Soles a dolas es: "+ obj.conversion_dolar(soles));//impresion del metodo no estatico
        
        String caracter = "hola";
        String caracter1 = "Hola";
        
        System.out.println("el caracter es: " + caracter);
        System.out.println(caracter.substring(1, 4));//partes
        System.out.println(caracter.length());//dimension de la cadena
        System.out.println(caracter.equals(caracter1));//comparacion extrema
        System.out.println(caracter.equalsIgnoreCase(caracter1));
        
    }
    //un metodo estatico
    public static double ConversionDolar(double soles)
    {
        double conversion = soles * dolar;
        return conversion;
    }
    //metodo no estatico
    public double conversion_dolar(double soles)
    {
        double conversion = soles * dolar;
        return conversion;
    }
    
    
}
