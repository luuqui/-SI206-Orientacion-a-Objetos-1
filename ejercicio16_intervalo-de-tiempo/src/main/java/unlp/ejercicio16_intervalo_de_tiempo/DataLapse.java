package unlp.ejercicio16_intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse implements Data{
	private LocalDate from;
	private LocalDate to;
	
	public DataLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.to;
	}

	@Override
	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(from) && other.isBefore(to));
	}
}
