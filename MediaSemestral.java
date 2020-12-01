import java.text.NumberFormat;

public class MediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a nota da prova 1: ");
		double prova1 = sc.nextDouble();
		System.out.print("Digite a nota do projeto 1: ");
		double projeto1 = sc.nextDouble();
		System.out.print("Digite a nota da lista de exercicios 1: ");
		double exercicios1 = sc.nextDouble();
		System.out.print("Digite a nota dos projetos de software livre 1: ");
		double projeto_soft1 = sc.nextDouble();
		
		double media_ponderada1 = ((prova1*3) + (projeto1*3) + (exercicios1*2) + (projeto_soft1*3)) / 11;
		
		System.out.print("Digite a nota da prova 2: ");
		double prova2 = sc.nextDouble();
		System.out.print("Digite a nota do projeto 2: ");
		double projeto2 = sc.nextDouble();
		System.out.print("Digite a nota da lista de exercicios 2: ");
		double exercicios2 = sc.nextDouble();
		System.out.print("Digite a nota dos projetos de software livre 2: ");
		double projeto_soft2 = sc.nextDouble();
		
		double media_ponderada2 = ((prova2*3) + (projeto2*3) + (exercicios2*2) + (projeto_soft2*3)) / 11;
		
		double media_semestral = media_ponderada1 + media_ponderada2 / 2;
		System.out.print("Média semestral = " +media_semestral);
		
		if (media_semestral >= 8) {
			System.out.print("APROVADO");
		}
		else if (media_semestral<8 && media_semestral>5){
			double falta = (10.00 - media_semestral);
			System.out.print("Você precisa tirar " +falta +" na prova final para ser aprovado.");
		}
		else {
			System.out.print("REPROVADO");
		}
		
	}

}
