
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scan.nextInt();

         System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scan.next();

         System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeTitular = scan.next();  

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = scan.nextDouble();

        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
       
       
        scan.close();
    }
}
