package unlp.ejercicio16_intervalo_de_tiempo;

import java.time.LocalDate;

public class DataInstances implements Data{
	private LocalDate from;
	private int sizeInDays;
	
	public DataInstances(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(getTo());
	}
}
