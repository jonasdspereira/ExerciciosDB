public class CarroAutomatico extends Carro{

    public CarroAutomatico(String marca, String modelo, int ano, int numPortas, String  tipoCambio, boolean possuiTetoSolar) {
        super(marca, modelo, ano, numPortas, tipoCambio, possuiTetoSolar);
    }

    @Override
    public void ligar() {
        if (freioPressionado()) {
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Pressione o freio para ligar o carro.");
        }
    }

    private boolean freioPressionado() {
        return true;
    }

}
