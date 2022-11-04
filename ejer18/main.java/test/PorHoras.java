class EmpleadoTest(){{
    
    private PorHoras activo;
    private PorHoras vencido;
//PorHoras(LocalDate fInicio, double valorPorHoras, int cantHoras, LocalDate fechaFin)
//Empleado(String nombre, String apellido, String CUIL, LocalDate fechaNac, boolean hijos, boolean conyugue)   
    void setUp() throw Exeption{
        this.activo = (new Empleado('Juan', 'Carlos', '6659', LocalDate.of(1983, 3, 12), true, true), LocalDate.of(2010, 6, 12), 400, 45, LocalDate.of(2023, 5, 31));
        this.vencido = (new Empleado('Maria', 'Jimenez', '0937', LocalDate.of(1970, 2, 20), true, true), LocalDate.of(2010, 6, 12), 500, 45, LocalDate.of(2021, 5, 31));
    }

    void estaVencido(){
        assertTrue(this.vencido.estaVencido());
        assertFalse(this.activo.estaVencido());
    }

    void calcularMonto(){
        assertEquals(18000, this.activo.calcularMonto());
        assertEquals(22500, this.vencido.calcularMonto());
    }
}