public class Empleado(){

    private String nombre;
    private String apellido;
    private String CUIL;
    private LocalDate fechaNac;
    private LocalDate inicioRelLaboral;
    private boolean conyugue;
    private boolean hijos;
    private List<Contrato> contratos;

    public Empleado(String nombre, String apellido, String CUIL, LocalDate fechaNac, boolean hijos, boolean conyugue){
        this.nombre = nombre;
        this.apellido = apellido;
        this.CUIL = CUIL;
        this.fechaNac = fechaNac;
        this.hijos = hijos;
        this.conyugue = conyugue;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getCUIL(){
        return this.CUIL;
    }

    public boolean getConyugue(){
        return this.conyugue;
    }

    public boolean getHijos(){
        return this.hijos;
    }

    public void agregarContratoPorHoras(ContratoPorHoras contratoPorHoras){
        this.contratos.add(contratoPorHoras);
    }

    public void agregarContratoDePlanta(ContratoDePlanta contratoDePlanta){
        this.contratos.add(contratoDePlanta);
    }

    public Contrato contratoVigente(){
        return this.contratos.stream().max((Contrato c1, Contrato c2) -> c1.getFechaInicio().compareTo(c2.getFechaInicio()));
    }

    public boolean tieneContratoVencido(){
        return this.contratoVigente().stream().map(contrato -> contarato.estaVencido()).orElse(true);
    }

    public Recibo generarRecibo(){
        return new Recibo(this, this.antiguedad(), this.calcularMontoTotal());
    }

    public double calcularMontoTotal(){
        if (! this.tieneContratoVencido()){
            return this.contratoVigente().map(contrato -> contrato.calcularMonto() + contrato.calcularMonto()*this.calcularAumento()).orElse(0d);
        }
        return 0
    }

    public int antiguedad(){
        return this.contaratos.stream().mapToInt(contrato -> contrato.calcularAnios()).sum();
    }

    public double calcularAumento(){
        if (this.antiguedad() >= 5){
            return 0.3;
        }else if(this.antiguedad() >= 10){
            return 0.5;
        }else if (this.antiguedad() >= 15){
            return 0.7;
        }else if(this.antiguedad() >= 20){
            return 1;
        }
    }
}