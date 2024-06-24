import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //Saudações de entrada
        System.out.println("Bem vindo ao aplicativo meu banco!  ");
        System.out.println("Para seguir com seu acesso, precisaremos de algumas informações");


        //Coleta de dados para Login
        System.out.println("Favor informar o seu número de agência abaixo: ");
        String numeroAgencia = scanner.next();

        System.out.println("Favor seu número de conta: ");
        String numeroConta = scanner.next();

        System.out.println("Favor informar seu nome abaixo: ");
        String nomeCliente = scanner.next();

        System.out.println("Favor informar seu saldo: ");
        double saldo = scanner.nextDouble();


        //Concatenação das informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", sua conta é " + numeroConta + " e seu saldo " + saldo + ". Já está disponível para saque!" );
        
        
}
}
