public class Moto extends Veiculo{
    private String tipoPartida;
    private int cilindradas;
    private boolean possuiBau;

    public Moto(String marca, String modelo, int ano, String tipoPartida, int cilindradas, boolean possuiBau) {
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
        this.cilindradas = cilindradas;
        this.possuiBau = possuiBau;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    public void ligarPartidaPedal() {
        System.out.println("Moto ligada com partida no pedal");
    }

    public void acelerar(int i) {
        System.out.println("Acelerou " + i + "Km/h");
    }

    public void frear(int i) {
        System.out.println("Freou " + i + "Km/h");
    }
}
