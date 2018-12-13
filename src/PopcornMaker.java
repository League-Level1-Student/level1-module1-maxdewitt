import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn corn = new Popcorn(flavor);
		Microwave wave = new Microwave();
		JOptionPane.showMessageDialog(null, "The popcorn has been placed in the nearby microwave.");
	    wave.putInMicrowave(corn);
		String timer = JOptionPane.showInputDialog("Set the microwave timer.");
		int timer1 = Integer.parseInt(timer);
		wave.setTime(timer1);
		wave.hashCode();
		JOptionPane.showMessageDialog(null, "The microwave is starting.");
		wave.startMicrowave();
		JOptionPane.showMessageDialog(null, "The popcorn is ready. Time to eat!");
		String finaldecision = JOptionPane.showInputDialog("Are you sure you want to eat this popcorn? (yes/no)");
		if (finaldecision.equalsIgnoreCase("yes"))
				{
			JOptionPane.showMessageDialog(null, "Ok, fine I guesss. Here is your hard earned popcorn...");
			corn.eat();
		}
		else if(finaldecision.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Wise decision... now I shall have the popcorn!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Well, you didn't give a valid answer, so the popcorn is mine!!!");
		}
			
	}



}
