public class DePlanta extends Contrato(){
    private double sueldoMensual;
    private double montoPorHijo;
    private double montoPorConyuge;

    public DePlanta(LocalDate fInicio, Empleado empleado, double saldoMensual, double montoPorHijo, double montoPorConyuge){
        this.super(fInicio,empleado);
        this.saldoMensual = saldoMensual;
        this.montoPorHijo = montoPorHijo;
        this.montoPorConyuge = montoPorConyuge;
    }

    public double calcularMonto(){
        return 
    }

    public boolean estaVencido(){
        return this.
    }
}