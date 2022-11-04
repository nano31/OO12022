public class PorHoras extends Contrato(){
    private double valorPorHoras;
    private int cantHoras;
    private LocalDate fechaFin;

    public PorHoras(LocalDate fInicio, double valorPorHoras, int cantHoras, LocalDate fechaFin){
        this.super(fInicio, empleado);
        this.valorPorHoras = valorPorHoras;
        this.cantHoras = cantHoras;
        this.fechaFin = fechaFin;
    }

    public double calcularMonto(){
        return this.valorPorHoras * this.cantHoras;
    }

    public boolean estaVencido(){
        return (this.fechaFin.isBefore(LocalDate.now()) || this.fechaFin.isEqual(LocalDate.now()));
    }
}