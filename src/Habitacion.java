public class Habitacion {

    private String nombre;
    private double area;
    private int piso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void describir() {
        System.out.println("Habitación: " + nombre + ", área: " + area + " m², piso: " + piso);
    }
}