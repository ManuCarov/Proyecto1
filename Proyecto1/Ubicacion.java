public class Ubicacion {
    
    private String nombre;
    private int distancia;
    private int cantZom; 

    public Ubicacion(String nombre, int distancia, int cantZom) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.cantZom = cantZom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getCantZom() {
        return cantZom;
    }

    public void setCantZom(int cantZom) {
        this.cantZom = cantZom;
    }

    @Override
    public String toString() {
        return "Ubicacion[ nombre= " + nombre + " distancia= " + distancia + " Numero de Zombies= " +  cantZom + "]";
    }

}
