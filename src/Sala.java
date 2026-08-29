public class Sala extends Habitacion {

    private boolean tieneTelevisor;

    public boolean isTieneTelevisor() {
        return tieneTelevisor;
    }

    public void setTieneTelevisor(boolean tieneTelevisor) {
        this.tieneTelevisor = tieneTelevisor;
    }

    public void describir() {
        super.describir();
        System.out.println("Es una sala. ¿Tiene televisor? " + (tieneTelevisor ? "Sí" : "No"));
    }
}