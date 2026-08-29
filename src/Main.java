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


        Silla silla = new Silla();
        silla.setNombre("Silla de oficina");
        silla.setMaterial("Madera");
        silla.setPrecio(150000);
        silla.setTieneBrazos(true);
        silla.describir();

        System.out.println();

        Mesa mesa = new Mesa();
        mesa.setNombre("Mesa de comedor");
        mesa.setMaterial("Vidrio");
        mesa.setPrecio(500000);
        mesa.setNumeroPersonas(6);
        mesa.describir();

        System.out.println();

        Refrigerador refrigerador = new Refrigerador();
        refrigerador.setNombre("Nevera");
        refrigerador.setMarca("LG");
        refrigerador.setPotenciaWatts(200);
        refrigerador.setCapacidadLitros(400);
        refrigerador.describir();

        System.out.println();

        Lavadora lavadora = new Lavadora();
        lavadora.setNombre("Lavadora");
        lavadora.setMarca("Samsung");
        lavadora.setPotenciaWatts(500);
        lavadora.setCapacidadKg(15);
        lavadora.describir();
    }
}
