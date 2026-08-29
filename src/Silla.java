public class Silla extends Mueble {

    private boolean tieneBrazos;

    public boolean isTieneBrazos() {
        return tieneBrazos;
    }

    public void setTieneBrazos(boolean tieneBrazos) {
        this.tieneBrazos = tieneBrazos;
    }

    public void describir() {
        super.describir();
        System.out.println("Es una silla. ¿Tiene brazos? " + (tieneBrazos ? "Sí" : "No"));
    }
}