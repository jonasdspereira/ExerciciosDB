public class MotoPartidaPedal extends Moto{
    public MotoPartidaPedal(String marca, String modelo, int ano, String tipoPartida, int cilindradas, boolean possuiBau) {
        super(marca, modelo, ano, tipoPartida, cilindradas, possuiBau);
    }

    @Override
    public void ligar() {
        if (aceleradorPuxado()) {
            System.out.println("Moto ligada");
        } else {
            System.out.println("Puxe o acelerador para ligar a moto.");
        }
    }

    private boolean aceleradorPuxado() {
        return true;
    }
}
