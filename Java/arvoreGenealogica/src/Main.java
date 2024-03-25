import javax.xml.transform.Source;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa avoPaterno = new Pessoa("Ademar", 70, null, null);
        Pessoa avoMaterno = new Pessoa("Alzira", 78, null, null);

        Pessoa pai = new Pessoa("Joao", 50, null, null);
        Pessoa mae = new Pessoa("Maria", 59, avoPaterno, avoMaterno);

        Pessoa filho = new Pessoa("Jonas", 28, pai, mae);

        System.out.println("**Árvore genealógica**");
        System.out.println(filho);
        System.out.println("Pai: " + filho.getPai());
        System.out.println("Mãe: " + filho.getMae());
        System.out.println("Avô Paterno: " + filho.getPai().getPai());
        System.out.println("Avó Materna: " + filho.getMae().getMae());

    }
}
