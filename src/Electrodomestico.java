public class Electrodomestico {

    private String nombre;
    private double potenciaWatts;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(double potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void describir() {
        System.out.println("Electrodoméstico: " + nombre + ", marca: " + marca + ", potencia: " + potenciaWatts + "W");
    }
}