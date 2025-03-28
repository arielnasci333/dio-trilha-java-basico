import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
      
        //TODO:Conhecer e importar a classe Scanner
        //TODO:Exibir as mensagens para o nosso usuário 
        //TODO:Obter pela classe Scanner os valores digitados no terminal   
        //TODO:Exibir a mensagem conta criada

    public static void main(String[] args) {
        
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o número da Agencia");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Por favor digite o nome da Agencia");
        String nomeAgencia = scanner.next();

        System.out.println("Por favor digite o nome do Cliente");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o saldo do Cliente");
        double saldo = scanner.nextDouble();
        
        //Mostrar a seguinte mensagem para o usuário:
        /*
         “Olá [NomeCliente], obrigado por criar uma conta em nosso
          banco, sua agencia é [Agencia], conta [Numero] e seu [Saldo] 
          já está disponível para saque.”
          
          Obs.: Como utilizamos String, o programa só aceita o 1º
          nome para a agencia e nome do cliente.          
         */
        

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + nomeAgencia + ", agencia " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");

    }
    }