public abstract class Contrato(){
    private LocalDate fechaInicio;
    private Empleado empleado;

    public Contrato(LocalDate fechaInicio, Empleado empleado){
        this.fechaInicio = fechaInicio;
        this.empleado = empleado;
    }

    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }
    public Empleado getEmpleado(){
        return this.empleado;
    }

    public abstract boolean estaVencido();
    public abstract double calcularMonto();
    public abstract int calcularAnios();
}