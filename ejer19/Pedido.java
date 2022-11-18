public class Pedido{
    private Producto producto;
    private int cantidadSolicitada;
    private Envio formaDeEnvio;
    private Pago formaDePago;

    public Pedido(Peoducto producto, int cantidadSolicitada, Envio formaDeEnvio, Pago formaDePago){
        this.producto = producto;
        this.cantidadSolicitada = cantidadSolicitada;
        this.formaDeEnvio = formaDeEnvio;
        this.formaDePago = formaDePago;
    }
}