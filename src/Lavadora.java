public class Lavadora extends Electrodomestico {

    private double capacidadKg;

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    public void describir() {
        super.describir();
        System.out.println("Es una lavadora con capacidad de " + capacidadKg + " kg.");
    }
}