public class Sistema(){
    private List<Persona> usuarios;

    public Sistema(){
        this.usuarios = new ArrayList<Persona>();
    }

    public Persona agregarUsuario(String nombre, String direccion){
        Persona persona = new Persona(nombre, direccion);
        this.usuarios.add(persona);
        return persona;
    }

    public buscarUsuario(String nombre){
        return this.usuarios.stream()
            .filter(usuario -> usuario.getNombre().startsWith(nombre))
            .findFirst().orElse(null);
    }

    public Producto cargarProducto(String nombre, String descripcion, double precio, int cantDisponibles, Persona vendedor){
        Producto producto = vendedor.cargarProducto(nombre,descripcion,precio,cantDisponibles);
        return producto;
    }

    public List<Producto> buscarProducto(String nombre){
        return this.usuarios.stream().map(usuario -> usuario.buscarProducto(nombre))
            .filter(producto -> producto != null).collect(Collectors.toList());
    }

    public Pedido crearPedido(Producto producto, int cantSolicitada, Envio formaEnvio, Pago formaPago){
        Pedido pedido = cliente.hacerPedido(producto, cantSolicitada, formaEnvio, formaPago);
        return pedido;
    }

    public double calcularCostoTotal(Pedido pedido){
        return pedido.calcularTotal(); 
    }
}