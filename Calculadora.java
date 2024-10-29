import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Introduzca un numero entero");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca un segundo numero entero");
        int n2 = new Scanner(System.in).nextInt();
        System.out.println("""
                Que accion quiere llevar a acabo?
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir""");
        int accion = new Scanner(System.in).nextInt();
    }
}
