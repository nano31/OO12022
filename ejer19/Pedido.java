public class Pedido{
    private Producto producto;
    private int cantidadSolicitada;
    private Envio formaDeEnvio;
    private Pago formaDePago;
    private Cliente cliente;

    public Pedido(Peoducto producto, int cantidadSolicitada, Envio formaDeEnvio, Pago formaDePago, Cliente cliente){
        this.producto = producto;
        this.cantidadSolicitada = cantidadSolicitada;
        this.formaDeEnvio = formaDeEnvio;
        this.formaDePago = formaDePago;
        this.cliente = cliente;
    }

    public double calcularTotal(){
        return this.formaDePago.calcularPago(this.calcularPrecioProductos()) + 
            this.formaDeEnvio.calcularEnvio(this.cliente.getDireccion(), this.producto.getDireccionVendedor());
    }

    public double calcularPrecioProductos(){
        return this.producto.precioPorCantidad(this.cantidadSolicitada);
    }
}