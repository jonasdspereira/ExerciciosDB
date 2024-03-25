import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Guincho {
    private double capacidadeCarga;
    private double comprimentoCorda;

    public Guincho (double capacidadeCarga, double comprimentoCorda) {
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoCorda = comprimentoCorda;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getComprimentoCorda() {
        return comprimentoCorda;
    }

    public void setComprimentoCorda(double comprimentoCorda) {
        this.comprimentoCorda = comprimentoCorda;
    }

    public void rebocar(Veiculo veiculo) {
        System.out.println("Veículo: " + veiculo.getMarca() + " Modelo " + veiculo.getModelo() + " Rebocado");
    }

    public void soltarVeiculo() {
        System.out.println("Veículo solto");
    }
}
