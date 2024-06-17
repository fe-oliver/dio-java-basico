import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importar e usar scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagens para o usuario
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Angência!");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número da sua conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta.");
        double saldo = scanner.nextDouble();

        // Obter os valores digitados no terminal
        String nomeCliente = nome.toUpperCase() + " " + sobrenome.toUpperCase();

        // EXibir mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo "+ saldo + " ja está disponivel para saque.");
        System.out.println();
    }
}
