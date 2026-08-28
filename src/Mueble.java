public class Mueble {

    private String nombre;
    private String material;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void describir() {
        System.out.println("Mueble: " + nombre + ", material: " + material + ", precio: $" + precio);
    }
}