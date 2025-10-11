package unlp.ejercicio13_inversores;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private LocalDate fechaConstitucion;
	private double montoDepositado;
	private double porcentajeInteres;

	public PlazoFijo(LocalDate fecha, double montoDepositado, double porcentajeInteres) {
		this.fechaConstitucion = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres = porcentajeInteres;
	}

	@Override
	public double getValorActual() {
		long dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
		return montoDepositado + (montoDepositado * porcentajeInteres * dias);
	}
}
