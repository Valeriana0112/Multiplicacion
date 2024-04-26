import java.util.Scanner; // se importa el scanner 

public class MainMultiplicacion { // se le asigna nombre a la clase main
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // utilizamos un scanner para leer las variables ya que nos perimite odtner la entra a datos primitivos 

        System.out.println("introduzca primer valor"); // Se imprime un mensaje en donde se le indica al usuario que ingrese un valor 
        int a = reader.nextInt(); // la variable del scanner reader 
        System.out.println("introduzca segundo valor");
        int b = reader.nextInt();
        //int r = a * b; // se declara la variable con la operacion que se desea realizar 
        Multiplicacion def = new Multiplicacion();
        def.a=a;
        def.b=b;

        System.out.println("El resultado es:" + def.Multiplicar()); // se imprime el resultado 

    }
}