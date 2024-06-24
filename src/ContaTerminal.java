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
        int numeroAgencia = scanner.nextInt();

        System.out.println("Favor sua agência abaixo: ");
        String agencia = scanner.next();

        System.out.println("Favor informar seu nome abaixo: ");
        String nomeCliente = scanner.next();

        

        




        


        

    }
}
