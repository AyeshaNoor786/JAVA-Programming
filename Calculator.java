import javax.swing.*;

class Calculator
{
	public static void main(String args[])
	{
		String x,y;
		String optr;
		int val1=0,val2=0;
		char operatr;

		x = JOptionPane.showInputDialog("Please Enter an Integer(x): ");
		y = JOptionPane.showInputDialog("Please Enter an Integer(y): ");
	
		optr = JOptionPane.showInputDialog("Please Enter an Operator: ");


		val1=Integer.parseInt(x);
		val2=Integer.parseInt(y);

		//operatr=Character.charValue(optr);
		

		if(optr=='+')
		{
			JOptionPane.showMessageDialog(null,"Addition: "+(val1+val2));
		}
		else if(optr=='-')
		{
			JOptionPane.showMessageDialog(null,"Addition: "+(val1-val2));
		}
	}
}	