import java.util.Scanner;

public class Ex6_Fatorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("De qual número deseja saber o Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

    
        for( int i = fatorial ; i >= 1 ; i-- ){

            multiplicacao = multiplicacao * i;
            
        }
        System.out.println("O Fatorial do número " + fatorial + " é: " + multiplicacao );
    }

}
