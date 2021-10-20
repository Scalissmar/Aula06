import java.util.Scanner;

public class EntendoVetor 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor [] = new int [6];
		Scanner leitor = new Scanner (System.in);
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.println("Digite ano de lançamento");
			vetor [i] = leitor.nextInt();
		
		}
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.println("O "+(i+1)+" fime foi lançado em " + vetor[i]);
		}
		
		
	}

}
