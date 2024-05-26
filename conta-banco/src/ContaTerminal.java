import javax.print.DocFlavor.STRING;
import java.util.Locale;
import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String usuario = "MÁRIO ANDRADE";
        double saldo = 237.48;
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Para começarmos, por favor, digite o número da Agência");
            String agenciaDaConta = scanner.next();

        System.out.println("Agora para prosseguirmos, por favor insira o número da conta");
            int numeroDaConta = scanner.nextInt();

        System.out.println("Olá " +  usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaDaConta + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");

        
    }
}
