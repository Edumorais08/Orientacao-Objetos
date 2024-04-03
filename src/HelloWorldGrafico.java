import javax.swing.JOptionPane;

public class HelloWorldGrafico {

    public static void main(String[] args) {

        String nome;

        nome = JOptionPane.showInputDialog("Informe o seu nome: ");

        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo!");

    }
}
