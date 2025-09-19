package unlp.ejercicio9_red_de_alumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> neighbors;
	
	public Farola() {
		this.interruptor = false;
		this.neighbors = new ArrayList<>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return neighbors;
	}
	
	public void turnOn() {
		if(!this.interruptor) {
			this.interruptor = true;
			for(Farola vecino: neighbors) {
				vecino.turnOn();
			}
		}	
	}
	
	public void turnOff() {
		if(this.interruptor) {
			this.interruptor = false;
			for(Farola vecino: neighbors) {
				vecino.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return interruptor;
	}
	
	public boolean isOff() {
		return !interruptor;
	}
}
