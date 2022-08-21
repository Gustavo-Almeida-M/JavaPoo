import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual é a sua idade?G");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu peso");
		double peso = scanner.nextDouble();
		
		System.out.println("Olá " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("E seu peso é: " + peso);
	}
}
