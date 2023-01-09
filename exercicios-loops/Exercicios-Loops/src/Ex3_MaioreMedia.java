import java.util.Scanner;

public class Ex3_MaioreMedia {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        
        double soma = 0;
        

        int contador = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
           
            soma = soma + numero;

            if (numero > maior) maior = numero;
            
            
            contador = contador + 1;
    
        } while (contador < 5);
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma/5));
        
    }


}
