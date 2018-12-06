import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn corn = new Popcorn(flavor);
		Microwave wave = new Microwave();
		
		String timer = JOptionPane.showInputDialog("Set the microwave timer.");
	}



}
