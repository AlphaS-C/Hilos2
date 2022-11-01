package model;

public class FabricaYeezy extends Thread {

	private TiendaAdidas tienda; // variable compartida

	public FabricaYeezy(TiendaAdidas tienda) {
		super();
		this.tienda = tienda;
	}
	
	@Override
	public void run() {
		// crea 10 yeezy y las manda a la tienda
		
		for (int i = 0; i < 10; i++) {
			Yeezy yeezy = new Yeezy("350");
			
			tienda.enviar(yeezy);
			System.out.println("Yeezy " + yeezy.getReferencia() + " - " + yeezy.getColor() + " enviadas a la tienda.");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
