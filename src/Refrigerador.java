public class Refrigerador extends Electrodomestico {

    private double capacidadLitros;

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(double capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public void describir() {
        super.describir();
        System.out.println("Es un refrigerador con capacidad de " + capacidadLitros + " litros.");
    }
}