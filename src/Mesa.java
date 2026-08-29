public class Mesa extends Mueble {

    private int numeroPersonas;

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public void describir() {
        super.describir();
        System.out.println("Es una mesa para " + numeroPersonas + " persona(s).");
    }
}