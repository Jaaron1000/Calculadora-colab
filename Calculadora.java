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
        double resultado = 0;
        int accion = new Scanner(System.in).nextInt();
        if(accion==1){
            resultado = n1+n2;
            System.out.println("El resultado es: "+resultado);
        }else if(accion==2){
            resultado = n1-n2;
            System.out.println("El resultado es: "+resultado);
        }else if(accion==3){
            resultado = n1*n2;
            System.out.println("El resultado es: "+resultado);
        }else if(accion==4){
            if(n2!=0){
                resultado = n1/n2*1.0;
                System.out.println("El resultado es: "+resultado);
            }else {
                System.out.println("El divisor no puede ser 0");
            }
        }else{
            System.out.println("La seleccion introducda no es valida");
        }

    }
}
