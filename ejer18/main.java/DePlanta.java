public class DePlanta extends Contrato(){
    private double sueldoMensual;
    private double montoPorHijo;
    private double montoPorConyuge;

    public DePlanta(LocalDate fInicio, double saldoMensual, double montoPorHijo, double montoPorConyuge){
        this.super(fInicio,empleado);
        this.saldoMensual = saldoMensual;
        this.montoPorHijo = montoPorHijo;
        this.montoPorConyuge = montoPorConyuge;
    }

    public double calcularMonto(){
        double monto = this.saldoMensual;
        if(this.getEmpleado().tieneConyugue()){
            monto += this.montoPorConyuge;
        }
        if(this.getEmpleado().tieneHijo()){
            monto += this.montoPorHijo;
        }
    }

    public boolean estaVencido(){
        return false;
    }
}