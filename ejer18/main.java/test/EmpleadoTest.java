class EmpleadoTest(){

    private Empleado empleadoContratoVencido;
    private Empleado empleadoContratoActivo;
    private Empleado empleAntiguedadMenor5;
    private Empleado empleAntiguedad5;
    private Empleado empleAntiguedad10;
    private Empleado empleAntiguedad15;
    private Empleado empleAntiguedad20;

    void setUp() throw Exeption{
        empleadoContratoActivo = new Empleado();
        empleadoContratoVencido = new Empleado();
        empleAntiguedadMenor5 = new Empleado();
        empleAntiguedad5 = new Empleado();
        empleAntiguedad10 = new Empleado();
        empleAntiguedad15 = new Empleado();
        empleAntiguedad20 = new Empleado();
    }

    void testCargarContrato(){
        this.empleadoContratoActivo.agregarContratoDePlanta(LocalDate.of(2017, 10, 5), 100, 20, LocalDate.of(2018, 10, 5));
        this.empleadoContratoActivo.agregarContratoPorHoras(LocalDate.of(2018, 10, 6), 200, 45, LocalDate.of(2019, 10, 6));
        this.empleadoContratoActivo.agregarContratoPorHoras(LocalDate.of(2020, 1, 12), 200, 50, 150);

        this.empleadoContratoVencido.agregarContratoPorHoras(LocalDate.of(2017, 10, 5), 100, 100, LocalDate.of(2018, 10, 5));
        this.empleadoContratoVencido.agregarContratoPorHoras(LocalDate.of(2019, 10, 5), 100, 100, LocalDate.of(2020, 10, 5));
        this.empleadoContratoVencido.agregarContratoPorHoras(LocalDate.of(2020, 11, 5), 100, 100, LocalDate.of(2021, 11, 5));

        this.empleAntiguedadMenor5.agregarContratoDePlanta(LocalDate.of(2020, 10, 8), 100, 0, 60);
        this.empleadoAntiguedad5.agregarContratoDePlanta(LocalDate.of(2017, 5, 10), 300, 40, 200);
        this.empleadoAntiguedad10.agregarContratoDePlanta(LocalDate.of(2018, 4, 12), 200, 100, 150);
        this.empleAntiguedad15.agregarContratoPorHoras(LocalDate.of(2007, 5, 14), 250, 45, LocalDate.of(2023, 12, 5));
        this.empleAntiguedad20.agregarContratoPorHoras(LocalDate.of(2002, 3, 2), 300, 40, LocalDate.of(2022, 12, 10));

    }

    void testTieneContratoVencido(){
        assertTrue(this.empleadoContratoVencido.tieneContratoVencido());
        assertFalse(this.empleadoContratoActivo.tieneContratoVencido());
    }

    void testAntiguedad(){
        assertEquals(2, this.empleAntiguedadMenor5.antiguedad());
        assertEquals(5, this.empleAntiguedad5.antiguedad());
        assertEquals(10, this.empleadoAntiguedad10.antiguedad());
        assertEquals(15, this.empleAntiguedad15.antiguedad());
        assertEquals(20, this.empleAntiguedad20.antiguedad());
    }

    void testCalcularAumento(){
        assertEquals(0, this.empleAntiguedadMenor5.calcularAumento());
        assertEquals(0.3, this.empleAntiguedad5.calcularAumento());
        assertEquals(0.5, this.empleadoAntiguedad10.calcularAumento());
        assertEquals(0.7, this.empleAntiguedad15.calcularAumento());
        assertEquals(1, this.empleAntiguedad20.calcularAumento());
    }

    void testCalcularMontoTotal(){
        assertEquals(160, this.empleAntiguedadMenor5.calcularMontoTotal());
        assertEquals(728, this.empleadoAntiguedad5.calcularMontoTotal());
        assertEquals(675, this.empleadoAntiguedad10.calcularMontoTotal());
        assertEquals(16875, this.empleadoAntiguedad15.calcularMontoTotal());
        assertEquals(24000, this.empleAntiguedad20.calcularMontoTotal());
    }
}