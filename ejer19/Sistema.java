public class Sistema(){
    private List<Vendedor> vendedores;
    private List<Cliente> clientes;
    private List<Producto> productos;

    public Sistema(){
        this.vendedores = new ArrayList<Vendedor>();
        this.clientes = new ArrayList<Cliente>();
        this.productos = new ArrayList<Producto>();
    }

    public Vendedor agregarVendedor(String nombre, String direccion){
        Vendedor vendedor = new Vendedor(nombre, direccion);
        this.vendedores.add(vendedor);
        return vendedor;
    }

    public Cliente agregarCliente(String nombre, String dirrecion){
        Cliente cliente = new Cliente(nombre, direccion);
        this.clientes.add(cliente);
        return cliente;
    }

    public Producto ponerProductoEnVenta(String nombre, String descripcion, double precio, 
            int cantUnidades, Vendedor vendedor){
        Producto producto = new Producto(nombre, descripcion, precio, cantUnidades, vendedor);
        this.productos.add(producto);
        return producto;
    }

    public Vendedor buscarVendedor(String nombre){
        return this.vendedores.stream()
            .filter(vendedor -> vendedor.getNombre().startsWith(nombre))
            .findFirst().orElse(null);
    }

    public Cliente buscarCliente(String nombre){
        return this.clientes.stream()
            .filter(cliente -> cliente.getNombre().startsWith(nombre))
            .findFirst().orElse(null);
    }

    public List<Producto> buscarProducto(String nombre){
        return this.productos.stream()
            .filter(producto -> producto.getNombre().equals(nombre))
            .collect(Collectors.toList());
    }

}