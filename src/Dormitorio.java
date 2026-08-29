public class Dormitorio extends Habitacion {

    private int numeroCamas;

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void describir() {
        super.describir();
        System.out.println("Es un dormitorio con " + numeroCamas + " camas.");
    }
}