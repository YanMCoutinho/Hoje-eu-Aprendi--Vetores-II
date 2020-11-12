//Coloque em ordem crescente a lista de vetores

public class NumOrdem {

	public static void main(String[] args) {
		int num[] = {2,3,1,4};
		
		for(int numAtual=0; numAtual < num.length; numAtual++) {
			for(int comparador = numAtual; comparador < num.length; comparador++) {
				if (num[numAtual] > num[comparador]) {
					
					int intermediario = num[numAtual];
					num[numAtual] = num[comparador];
					num[comparador] = intermediario;
				}
					
			}	
		
		}
		for(int numLeitor:num) {
			System.out.print(numLeitor+ " ");
		}
	}

}
