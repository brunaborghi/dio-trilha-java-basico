import java.util.Scanner;

public class Ex4_ParEImpar {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qtdnumeros;
        int numero;
        int qtdPar = 0;
        int qtdImpar = 0;


        System.out.println("Quantidade de números: ");
        qtdnumeros = scan.nextInt();

        int contador = 0;
        do{

            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if (numero % 2 == 0) qtdPar++;
            else qtdImpar++;
            
            contador++;

        } while (contador < qtdnumeros);
 
        System.out.println("Quantidade Par: " + qtdPar);
        System.out.println("Quantidade Ímpar: " +qtdImpar);
    }
}
