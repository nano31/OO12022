public class Recibo(){

    private LocalDate fechaRecibo;
    private double montoTotal;
    private Empleado empleado;

    public Recibo(LocalDate fechaRecibo, Empleado empleado, int antiguedad, double montoTotal){
        this.fechaRecibo = fechaRecibo;
        this.empleado = empleado;
        this.antiguedad = antiguedad;
        this.montoTotal = montoTotal;
    }
}