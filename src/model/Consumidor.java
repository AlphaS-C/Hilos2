package model;

public class Consumidor extends Thread {

	private TiendaAdidas tienda; // variable compartida

	public Consumidor(TiendaAdidas tienda) {
		super();
		this.tienda = tienda;
	}
	
	@Override
	public void run() {
		// compran 10 yeezy
		
		for (int i = 0; i < 10; i++) {
			Yeezy yeezy = tienda.sacar();
			// imprime que yeezy sacó
			System.out.println("Yeezy sacada: " + yeezy.getReferencia() + " - " + yeezy.getColor());
			
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
