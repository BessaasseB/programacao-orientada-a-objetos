import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do seu animal");
        String raca = JOptionPane.showInputDialog(null, "Raca do animal");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do animal"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o peso do animal"));
        
        JOptionPane.showMessageDialog(null, "Nome: "+nome + "\nRaca: "+raca + "\nIdade: "+idade + " anos\nPeso: "+peso+" Kg");
    }
    
}
