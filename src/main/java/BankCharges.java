import java.text.*;
import javax.swing.JOptionPane;

public class BankCharges {
	public static void main(String[] args) {
		double baseFee = 10;
		String input1 = JOptionPane.showInputDialog("Enter the number of checks written");
		int checks = Integer.parseInt(input1);
		double lessTwenty = .10*checks;
		double twentyPlus = .08*checks;
		double fortyPlus = .06*checks;
		double sixtyPlus = .04*checks;


		double lessTwentyTotal = .10*checks + baseFee;
		double twentyPlusTotal = .08*checks + baseFee;
		double fortyPlusTotal = .06*checks + baseFee;
		double sixtyPlusTotal = .04*checks + baseFee;

	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);


		if (checks < 60)
			if (checks >= 40)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(fortyPlus) + "\nTotal Fees: $" + fortyPlusTotal);
			else if(checks >= 20)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(twentyPlus) + "\nTotal Fees: $" + twentyPlusTotal);
			else
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(lessTwenty) + "\nTotal Fees: $" + lessTwentyTotal);
		else
			JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(sixtyPlus) + "\nTotal Fees: $ " + sixtyPlusTotal);
	}

}
