

import java.util.Scanner;

public class p1136 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantos = input.nextInt();

		int numeros[] = new int[quantos];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		BST arv = new BST(numeros);
		System.out.println(arv.toStringPosOrder());
	}

	static class BST {
		Nodo raiz;
		Nodo noTemporario;
		Nodo raizAux;
		Nodo pai;
		String saida= "";

		BST(int[] lista) {
			raiz = null;

			for(int i= lista.length -1; i >= 0; i--){				
				noTemporario = new Nodo (lista[i]);
				addNodo(raiz,noTemporario);
			}
		}

		void addNodo(Nodo umaRaiz, Nodo no) {
			pai = null;
			raizAux = raiz;
			while (raizAux != null){
				pai = raizAux;
				if (no.conteudo < raizAux.conteudo){
					raizAux = raizAux.esquerdo;
				}else{
					raizAux = raizAux.direito;
				}
			}
			if (pai == null){
				raiz = no;
			}else{
				if (no.conteudo < pai.conteudo){
					pai.esquerdo = no;
				}else{
					pai.direito = no;
				}
			}
		}

		void posOrdem (Nodo raiz){
			if (raiz != null){
				posOrdem(raiz.direito);
				posOrdem(raiz.esquerdo);
				saida += raiz.conteudo + " ";				
			}
		}

		String toStringPosOrder() {	
			posOrdem(raiz);
			saida = saida.trim();
			return saida;
		}

	}
	static class Nodo {

		int conteudo;
		Nodo esquerdo;
		Nodo direito;

		public Nodo (int numero){
			conteudo = numero;
			esquerdo = null;
			direito = null;		
		}
	}
}