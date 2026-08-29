public class Main {
    public static void main(String[] args) {


        Dormitorio dormitorio = new Dormitorio();
        dormitorio.setNombre("Habitación principal");
        dormitorio.setArea(20.5);
        dormitorio.setPiso(2);
        dormitorio.setNumeroCamas(2);
        dormitorio.describir();

        System.out.println();

        Sala sala = new Sala();
        sala.setNombre("Sala de estar");
        sala.setArea(30.0);
        sala.setPiso(1);
        sala.setTieneTelevisor(true);
        sala.describir();

        System.out.println();

