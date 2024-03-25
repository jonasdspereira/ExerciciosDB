import java.util.SplittableRandom;

public class Carro extends Veiculo {

    private int numPortas;
    private String tipoCambio;
    private boolean possuiTetoSolar;

    public Carro(String marca, String modelo, int ano, int numPortas, String  tipoCambio, boolean possuiTetoSolar) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
        this.tipoCambio = tipoCambio;
        this.possuiTetoSolar = possuiTetoSolar;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public boolean isPossuiTetoSolar() {
        return possuiTetoSolar;
    }

    public void setPossuiTetoSolar(boolean possuiTetoSolar) {
        this.possuiTetoSolar = possuiTetoSolar;
    }

    public void ligatTetoSolar() {
        if (possuiTetoSolar) {
            System.out.println("Teto solar aberto.");
        } else {
            System.out.println("Não possui teto solar.");
        }
    }

    public void acelerar(int i) {
        System.out.println("Acelerou " + i + "Km/h");
    }

    public void frear(int i) {
        System.out.println("Freou " + i + "Km/h");
    }

    public void ligarTetoSolar() {
    }
}
