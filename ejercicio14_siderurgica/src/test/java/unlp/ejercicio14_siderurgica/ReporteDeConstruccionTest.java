package unlp.ejercicio14_siderurgica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	
	ReporteDeConstruccion reporte;
	PrismaRectangular prisma;
	Esfera esfera;
	Cilindro cilindro;

	@BeforeEach
	void setUp() throws Exception {
		reporte = new ReporteDeConstruccion();
		prisma = new PrismaRectangular("Hierro", "Rojo", 20, 10, 5);
		esfera = new Esfera("Hierro", "verde", 5);
		cilindro = new Cilindro("Acero", "verde", 4, 10);
	}

	@Test
	void testReporteDeConstruccion() {
		reporte.addPieza(prisma);
		reporte.addPieza(esfera);
		reporte.addPieza(cilindro);
		assertEquals(1523.5988, reporte.volumenDeMaterial("Hierro"), 0.01);
		assertEquals(523.5988,  esfera.volumen(), 0.01);
		assertEquals(502.6548,  cilindro.volumen(), 0.01);
		assertEquals(700.0, prisma.superficie(), 0.01);
		assertEquals(314.1593, esfera.superficie(), 0.01);
		assertEquals(351.8584, cilindro.superficie(), 0.01);
		assertEquals(314.1593 + 351.8584, reporte.superficieDeColor("Verde"), 0.01);
}

}
