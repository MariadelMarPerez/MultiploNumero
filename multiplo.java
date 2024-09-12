import java.util.Scanner;
public class multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero que desea operar");
        double numero1=sc.nextDouble();
        System.out.println("Ingrese el segundo numero que desea operar con el primero");
        double numero2=sc.nextDouble();

        if (numero1==0 || numero2==0) {
            System.out.println("Error ninguno de los numeros puede ser cero");
        }
            else if(numero1 % numero2 == 0) {
                System.out.println(numero1 + " es multiplo de "+ numero2);
            }
            else if (numero1 % numero2 != 0) {
                    System.out.println(numero1 + " no es multiplo de "+ numero2);
            }

            if (numero2 % numero1 == 0) {
            System.out.println(numero2 + " es multiplo de " + numero1);
            }
            else if (numero2 % numero1 != 0) {
                System.out.println(numero2 + " no es multiplo de "+ numero1);
            }
            
            if (numero1 % numero2!=0 && numero2 % numero1!=0) {
            System.out.println("Ninguno de los numeros es multiplo del otro");
            }
            sc.close();
    }
       }
    