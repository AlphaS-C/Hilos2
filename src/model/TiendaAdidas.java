package model;

import java.util.ArrayList;

public class TiendaAdidas {

	private ArrayList<Yeezy> estante = new ArrayList<Yeezy>();
	private int limiteEstante = 5;
	private boolean estaLleno = false;
	private boolean estaVacio = true;
	
	
	public synchronized void enviar(Yeezy yeezy) {
		// espera si está lleno
		while (estaLleno) {
			try {
				wait(); 
			} catch ( InterruptedException e) {}
		}
		
		// agrega una yeezy al estante
		estante.add(yeezy);
		// comprueba si esta lleno el array
		if (estante.size() >= limiteEstante) {
			estaLleno = true;
		}
		estaVacio = false;
		notify();
	}
	
	public synchronized Yeezy sacar() {
		// espera si estta vacio
		while (estaVacio) {
			try {
				wait(); 
			} catch ( InterruptedException e) {}
		}
		
		Yeezy yeezySacada = estante.get(0);
		estante.remove(0);
		
		if (estante.size() == 0 ) {
			estaVacio = true;
		}
		estaLleno = false;
		notify();
		
		return yeezySacada; // devuelve la primera yeezy que esta en el array.
	}

}
