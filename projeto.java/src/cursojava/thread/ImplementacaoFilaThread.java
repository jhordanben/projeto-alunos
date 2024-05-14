package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoThread>();
	
	public static void add(ObjetoThread objetoThread) {
		pilha_fila.add(objetoThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
					
		Iterator iteracao = pilha_fila.iterator();	
		
		synchronized (iteracao) {
				
			while (iteracao.hasNext()) { /*ENQUANTO CONTER DADOS NA LISTA, IRÁ PROCESSAR*/
				
				ObjetoThread processar = (ObjetoThread) iteracao.next();
				
				//processar 10k notas fiscais
				//gerar uma lista enorme de pdf
				//gerar um envio em massa de email
				
				System.out.println("===========================");
				
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { //dar um tempo pra dar descarga de memoria 
					e.printStackTrace();
				}
				
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		} 
	}
}

