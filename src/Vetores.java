import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double [] aluno = new double [10];
		Scanner leitor = new Scanner(System.in);
		double total = 0 ;
		
		for (int i = 0; i < aluno.length; i++)
		{
		System.out.println("Por favor, digite o consumo " + (i+1) + " alunos");
		
		aluno [i] = leitor.nextDouble();
		
		total = total + aluno [i];
		}
		
		
		
		for (int i = 0; i < aluno.length; i++)
		{
		System.out.println("O aluno " + (i+1) +  " consumiu R$" + aluno [i]);
		

		System.out.println("O total de consumo foi de R$" + total);
		}
		leitor.close();
		

	}

}
