
import java.util.*;

 class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("P1:");
		double P1 = sc.nextDouble();
		System.out.println("P2:");
		double P2 = sc.nextDouble();
		System.out.println("P3:");
		double P3 = sc.nextDouble();
		System.out.println("P4:");
		double P4 = sc.nextDouble();

		double n1 = (P1 + P2)/2;
		double n2 = (P3 + P4)/2;
		double n3 = (n1 + n2)/2;
		
		//aluno tirou acima de 7 
		if( n3 >=7 ) {			
			System.out.println("Aprovado, nota final: " + n3);
			
		// aluno ficou cm 7 e  4 	
		} else {			
			if (n3  >=  4) {
				//System.out.println("PF:");
				System.out.println("PF:");
				double PF = sc.nextDouble();
				double NF = (n3 + PF)/2;
				
				//aluno fez prova final ficou cm nota acima de 5
				if ( NF > 5) {
					System.out.println("Aprovado, nota final: " + NF);
					
				// abaixo de 5 	
				}else {
					System.out.println("Reprovado, nota final: " + NF);
				}
				
			}
			// nota abaixo de 4
			else {
				System.out.println("Reprovado, nota final: " + n3);
						
				
			}
		}
			
	}

}
