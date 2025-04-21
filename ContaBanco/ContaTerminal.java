package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Por favor, digite o Numero de usuário!");
			
			int Numero = sc.nextInt();
			
				sc.nextLine(); //Consumir o que tem no buffer
			
		System.out.println("Por favor, digite o número da Agência !");
		
			String Agencia = sc.nextLine();
			
		System.out.println("Por favor, digite o seu nome:");
		
			String Nome = sc.nextLine();
			
		System.out.println("Por favor, insira o saldo:");
		
			double Saldo = sc.nextDouble();
			
		System.out.printf("Olá %s, "
				+ "obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s, "
				+ "conta [%d] e seu saldo [%.2f] "
				+ "já está disponível para saque", 
				   Nome, Agencia, Numero, Saldo );
		
		sc.close();
			}

}
