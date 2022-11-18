public class Producto(){
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantUnidades;

    public Producto(String nombre, String descripcion, double precio, int cantUnidades){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantUnidades = cantUnidades;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidadUnidades(){
        return this.cantUnidades;
    }

    public int actualizarStock(int cantidadSolicitada){
        return this.getCantidadUnidades() -= cantidadSolicitada;
    }
}