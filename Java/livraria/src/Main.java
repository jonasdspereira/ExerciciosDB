//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jonas");

        Livro livro = new Livro("POO Java");

        Emprestimo emprestimo = new Emprestimo(pessoa, livro);

        System.out.println("Detalhes do Empréstimo: ");
        System.out.println("Pessoa: " + emprestimo.getPessoa().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Data do Empréstimo: " + emprestimo.getDataEmprestimo());

        livro.emprestar();
        System.out.println("Disponível para empréstimo? " + !livro.isEmprestado());

        livro.emprestar();
        System.out.println("Disponível para empréstimo? " + !livro.isEmprestado());

        livro.devolver();
        System.out.println("Disponível para empréstimo? " + !livro.isEmprestado());

        livro.emprestar();
        System.out.println("Disponível para empréstimo? " + !livro.isEmprestado());

    }
}