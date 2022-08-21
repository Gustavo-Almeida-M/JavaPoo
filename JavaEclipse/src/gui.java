import javax.swing.JOptionPane;
import java.util.Scanner;

public class gui 
{
	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		//JOptionPane.showMessageDialog(null, "Ola "+nome);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		//JOptionPane.showMessageDialog(null, nome+" você tem "+idade+" anos");
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		JOptionPane.showMessageDialog(null, nome+" você tem "+idade+" anos e pesa "+peso+" quilos.");
	}
}
