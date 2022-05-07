public class Zombies {
    private String nombre;
    private int salud;
    private int nacimiento;
    private String tipoSangre;
     
    public Zombies(String nombre, int salud, int nacimiento, String tipoSangre) {
        this.nombre = nombre;
        this.salud = salud;
        this.nacimiento = nacimiento;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Zombies[ nombre= " + nombre + " salud= " + salud + " nacimiento= " +  nacimiento + " tipoSangre= " + tipoSangre + "]";
    }
}
