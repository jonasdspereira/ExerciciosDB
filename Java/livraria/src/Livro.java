public class Livro {
    private String titulo;
    private boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if(emprestado) {
            System.out.println("Este livro já está emprestado.");
        } else {
            this.emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        }
    }

    public void devolver() {
        this.emprestado = false;
        System.out.println("Livro devolvido com sucesso!");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}
