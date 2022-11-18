public class EnSeisCuotas implements Pago{
    public double calcularPago(double monto){
        return monto + (monto*0.2);\
    }
}