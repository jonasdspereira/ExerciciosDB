public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
