public class Main {
    public static void main(String[] args) {
        CarroAutomatico carroAuto = new CarroAutomatico("Ford", "Focus", 2022, 4, "Automático", true);
        MotoPartidaPedal motoPedal = new MotoPartidaPedal("Honda", "CBR 1000RR", 2022, "null", 200, false);
        Guincho guincho = new Guincho(5000, 10);

        System.out.println("=== Testando Carro Automático ===");
        carroAuto.ligar(); // Verifica se o freio está pressionado para ligar
        carroAuto.acelerar(50);
        carroAuto.frear(20);
        carroAuto.ligarTetoSolar(); // Carro com teto solar

        System.out.println("\n=== Testando Moto com Partida no Pedal ===");
        motoPedal.ligar(); // Verifica se o acelerador está puxado para ligar
        motoPedal.acelerar(80);
        motoPedal.frear(15);

        System.out.println("\n=== Testando Guincho ===");
        guincho.rebocar(carroAuto); // Guincho rebocando um carro
        guincho.soltarVeiculo();

        guincho.rebocar(motoPedal); // Guincho rebocando uma moto
        guincho.soltarVeiculo();
    }
}
