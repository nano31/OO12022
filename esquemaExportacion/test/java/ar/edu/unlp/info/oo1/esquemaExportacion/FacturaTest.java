package ar.edu.unlp.info.oo1.esquemaExportacion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {
	private Factura facturaSinItems;
	private Factura facturaConItems;
	
	private Pedido pedido;
	private Pedido pedidoVacio;
	private Bien bien;
	private Servicio serv;
	private LocalDate fecha;
	
	@BeforeEach
	void setUp() throws Exception {
		this.fecha = LocalDate.now();
		this.pedido = new Pedido("hola", fecha, "Nano" );
		this.pedidoVacio = new Pedido("pedidoVacio", fecha, "Andy");
		this.pedido.agregarBien(pedido, "unBien", 50, 100, 20);
		this.pedido.agregarServicio(pedido, "service", 100, 200);
		this.facturaConItems = pedido.crearFactura();
		this.facturaSinItems = pedidoVacio.crearFactura();
	}

	@Test
	void testCreacion() {
		assertEquals(0, this.facturaSinItems.getItems().size());
		assertEquals(2, this.facturaConItems.getItems().size());
	}
	
	void testCostoFinal() {
		assertEquals(1350, this.facturaConItems.getCostoFinal());
	}

}
