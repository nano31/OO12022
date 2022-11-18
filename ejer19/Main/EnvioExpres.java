public class EnvioExpress implements Envio{
    private Mapa map;

    public EnvioExpress(){
        map = new Mapa();
    }

    public double calcularEnvio(String direccion1, String direccion2){
        return 0.5 * map.distanciaEntre(direccion1,direccion2);
    }
}