class DePlantaTest(){

    private DePlanta empleConHijo;
    private DePlanta empleCasado;
    private DePlanta empleCompleto;
    private DePlanta empleSinNada;

    //Empleado(String nombre, String apellido, String CUIL, LocalDate fechaNac, boolean hijos, boolean conyugue)

    void setUp() throw Exeption{
        this.empleConHijo = (new Empleado('Pepe', 'Garcia', '1234', LocalDate.of(2000, 5, 12), true, false), LocalDate.of(2017, 11, 3),300, 50, 200);
        this.empleCasado = (new Empleado('Juan', 'Fulano', '5627', LocalDate.of(1998, 12, 1), false, true), LocalDate.of(2015, 11, 3),400, 20, 150);
        this.empleCompleto = (new Empleado('Jimena', 'Perez', '6377', LocalDate.of(1970, 7, 12), true, true), LocalDate.of(2002, 2, 1),450, 100, 200);
        this.empleSinNada = (new Empleado('Carla', 'Solano', '8635', LocalDate.of(1995, 3, 25), false, false), LocalDate.of(2020, 2, 3),300, 50, 150);
    }

    void testEstaVencido(){
        assertFalse(this.empleConHijo.estaVencido());
        assertFalse(this.empleCasado.estaVencido());
        assertFalse(this.empleCompleto.estaVencido());
        assertFalse(this.empleSinNada.estaVencido());
    }

    void testCalcularMonto(){
        assertEquals(350, this.empleConHijo.calcularMonto());
        assertEquals(550, this.empleCasado.calcularMonto());
        assertEquals(750, this.empleCompleto.calcularMonto());
        assertEquals(300, this.empleSinNada.calcularMonto());
    }
}