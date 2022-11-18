public class Persona{
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    private List<Pedido> pedidos;

    public Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<Producto>();
        this.pedidos = new ArrayList<Pedido>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public Producto cargarProducto(String nombre, String descripcion, double precio, int cantUnidades){
        Producto producto = new Producto(nombre,descripcion,precio,cantUnidades);
        this.productos.add(producto);
        return producto;
    }

    public Pedido crearPedido(Producto producto, int cantSolicitada, Envio formaEnvio, Pago formaPago){
        Pedido pedido = new Pedido(producto,cantSolicitada,formaEnvio,formaPago);
        this.pedidos.add(pedido);
        return pedido;
    }
}