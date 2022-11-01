package application;

import model.Consumidor;
import model.FabricaYeezy;
import model.TiendaAdidas;

public class Main {

	public static void main(String[] args) {

		TiendaAdidas tienda = new TiendaAdidas();
		
		FabricaYeezy t1 = new FabricaYeezy(tienda);
		Consumidor t2 = new Consumidor(tienda);

		t1.start();
		t2.start();
	}

}
