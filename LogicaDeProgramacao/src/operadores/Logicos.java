package operadores;

public class Logicos {

	public static void main(String[] args) {
		
		/*
		 
		 < menor
		 > maior
		 <= menor ou igual
		 >= maior ou igual
		 == igual
		 != diferente  
		 
		 obs: sempre retornam valores boleanos
		 
		 */
		
		boolean is10MaiorQue20 = 10 > 20;
		System.out.println(is10MaiorQue20);
		
		boolean is10MenorQue20 = 10 < 20;
		System.out.println(is10MenorQue20);
		
		boolean is10DiferenteQue20 = 10 != 20;
		System.out.println(is10DiferenteQue20);
		
		/* 
		   &&(AND) (todas as condições tem de ser verdadeiras)
		   ||(or)  (uma das condições tem de ser verdadeiras)
		   !(not)
		*/
		
		/*
		 contexto, em um certo pais quem tem mais de 30 anos de nacionalidade tem direito a um salario de mais de 4000, isso é lei.
		 */
		
		int idade = 35;
		float salario = 3500.0f;
		boolean isDentroDaLeiMaiorQueTrinta = idade >30 && salario > 4000;
		System.out.println(isDentroDaLeiMaiorQueTrinta);
		
		/*
		contexto, quero comprar um ingresso pro show do Metallica 
	     */
		
		double valorTotalDaContaCorrente = 200;
		double valorTotalDaContaPoupanca = 5000;
		double valorDoIngressoDoShowDoMetallica = 4500;
		boolean possoComrprarUmIngressoProShowDoMetallica = valorTotalDaContaCorrente > valorDoIngressoDoShowDoMetallica ||
				valorTotalDaContaPoupanca > valorDoIngressoDoShowDoMetallica;
				
		System.out.println(possoComrprarUmIngressoProShowDoMetallica);
		
		
	}
	
}
