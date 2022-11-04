public class Empresa(){
    private List<Empleado> empleados;

    public Empresa(){
        this.empleados = new ArrayList<Empleado>();
    }

    public Empleado altaEmpleado(String nombre, String apellido, String CUIL, LocalDate fechaNacimiento, boolean hijos, boolean conyugue){
        Empleado empleado = new Empleado (nombre, apellido, CUIL, fechaNacimiento, hijos, conyugue);
        this.empleados.add(empleado);
        return empleado;
    }

    public Empleado buscarEmpleado(String CUIL){
        return this.empleados.stream().filter(empleado -> empleado.getCUIL().equals(CUIL)).findFirst().orElse(null);
    }

    public void bajaEmpleado(Empleado empleado){
        this.empleados.remove(empleado);
    }

    public void cargarContratoPorHoras(LocalDate fechaIncio, Empleado empleado, double valorXHoras, int cantHoras, LocalDate fechaFin){
        empleado.agregarContratoPorHoras(fechaIncio, fechaFin, valorXHoras, cantHoras);
    }

    public void cargarContratoDePlanta(LocalDate fechaIncio, Empleado empleado, double saldoMensual, double montoXHijo, double montoXConyugue){
        empleado.agregarContratoDePlanta(fechaInicio, saldoMensual, montoXHijo, montoXConyugue);
    }

    public List<Empleado> empleadosConContratosVencidos(){
        return this.empleados.stream().filter(empleado -> empleado.tieneContratoVencido()).collect(Collectors.toList());
    }

    public List<Recibo> generarRecibos(){
        return this.empleados.stream().map(empleado -> empleado.generarRecibo()).collect(Collectors.toList());
    }
}