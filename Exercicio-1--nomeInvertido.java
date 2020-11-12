//Coloque seu nome e sobrenome em ordem

public class NomeInvertido {

	public static void main(String[] args) {
		String nome = "Yan Mendonça Coutinho";
		String[] nomeVetor = new String[21];
		for(int cont = 1; cont<=nome.length(); cont++ ) {
			nomeVetor[(cont-1)] = nome.substring((cont-1),cont);
		}
		for(String nomeLeitor:nomeVetor) {
			System.out.println(nomeLeitor);
		}
	}

}