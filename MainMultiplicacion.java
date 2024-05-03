import java.util.Scanner; 

public class MainMultiplicacion { 
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Multiplicacion mul = new Multiplicacion();
System.out.println("INGRESA EL PRIMER NUMERO:");
mul.setA (sc.nextInt());
System.out.println("INGRESA EL SEGUNDO NUMERO:");
mul.setB (sc.nextInt());       
System.out.println(mul.multiplicacion());
System.out.println(mul.toString());
mul.getA();
mul.getB();
}

}
