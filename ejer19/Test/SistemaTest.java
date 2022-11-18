class SistemaTest{

    private Sistema sistema;

    private Pago AlContado;
    private Pago EnSeisCuotas;

    private Envio EnvioExpress;
    private Envio RetiroEnComercio;
    private Envio RetiroEnCorreo;

    private Persona cliente;
    private Persona vendedor;
    private Producto prod1;

    void setUp() throws Exception{
        this.sistema = new Sistema();

        this.cliente = this.sistema.agregarUsuario("Pepe", "12 e/ 56 y 57");
        this.vendedor = this.sistema.agregarUsuario("Carla", "46 e/ 1 y 2");
        this.producto = this.sistema.cargarProducto("prod1", "un producto", 1000, 60, this.vendedor);
        this.producto1 = this.sistema.cargarProducto("prod1", "un producto", 600, 60, this.vendedor);
        this.producto2 = this.sistema.cargarProducto("prod1", "un producto", 2000, 60, this.vendedor);
    }

    void testBuscarUsuario(){
        assertEquals(this.vendedor.getNombre(), this.sistema.buscarUsuario("Carla"));
        assertNull(this.sistema.buscarUsuario("Juan"));
    }

    void testBuscarProducto(){
        assertEquals(3, this.sistema.buscarProducto().size());
        assertTrue(this.sistema.buscarProducto("prod1"));
    }

    void testPedidoAlContadoEnvioADomicilio(){
        //Producto producto, int cantSolicitada, Envio formaEnvio, Pago formaPago, Cliente cliente
        this.AlContadoADomicilio = this.sistema.crearPedido(this.producto, new EnvioExpress(), new AlContado(), this.cliente);
        assertEquals(1500, this.sistema.calcularCostoTotal(AlContadoADomicilio));
    }
    
    void testPedidoEncuotasRetiroLocal(){
        this.enCuotasRetiroLocal = this.sistema.crearPedido(this.producto2, new RetiroEnComercio(), new EnSeisCuotas(), this,cliente);
        assertEquals(2000, this.sistema.calcularCostoTotal(enCuotasRetiroLocal));
    }
}