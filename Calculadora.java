import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
				System.out.println("Digite o nome do usuário:");
				String nome;
				Scanner sc = new Scanner (System.in);
				nome = sc.next();
				System.out.println("Bem vindo(a) :" + nome);
			    System.out.println("_________________________");
				System.out.println("Universidade Futuro");
				System.out.println("_________________________");
				System.out.println("Calculadora");
				System.out.println("_________________________");
				System.out.println("Digite [1] para soma:");
				System.out.println("Digite [2] para subtração:");
				System.out.println("Digite [3] para multiplicação:");
				System.out.println("Digite [4] para divisão:");
				
				
				int valor;
				Scanner teclado = new Scanner(System.in);
				valor = teclado.nextInt();
				
				if (valor == 1) {
					System.out.println("Digite os valores das somas");
					double soma1,soma2,somaTotal;
					soma1 = teclado.nextDouble();
					soma2 = teclado.nextDouble();
					somaTotal = (soma1 + soma2);
					System.out.println("A soma dos números é: " + somaTotal);
				}
				if(valor==2) {
					System.out.println("Digite os valores da subtração:");
					double sub1,sub2,subTotal;
					sub1 = teclado.nextDouble();
					sub2 = teclado.nextDouble();
					subTotal = (sub1 - sub2);
					System.out.println("O valor é :" + subTotal);
				}
				if(valor==3) {
					System.out.println("Digite os valores da multiplicação:");
					double multi1,multi2,multiTotal;
					multi1 = teclado.nextDouble();
					multi2 = teclado.nextDouble();
					multiTotal = (multi1*multi2);
					System.out.println("O valor é ; " + multiTotal);
				}
				if(valor==4) {
					System.out.println("Digite os valores da divisão:");
					double div1,div2,divTotal;
					div1 = teclado.nextDouble();
					div2 = teclado.nextDouble();
					divTotal = (div1/div2);
					System.out.println("O resultado da divisão é:" + divTotal);
				}
	
	
	}
}
						
						
			

	
					
					
					
					
					
					
				

		

	

