import javax.swing.JOptionPane ;
public class SC {
	public static void main(String[] args){
	String Fn = JOptionPane.showInputDialog("Enter First Number");
	String Sn = JOptionPane.showInputDialog("Enter Second Number");
	int num1 = Integer.parseInt(Fn);
	int num2 = Integer.parseInt(Sn);
	String operator = JOptionPane.showInputDialog("Enter choice");
	char c = operator.charAt(0);
	int s = 0 ;
	switch(operator){
	case "+":
	 s = num1 + num2 ;
	break;

	case "/" :
	 s = num1 / num2 ;
	break;

	case "-" :
	 s = num1 - num2 ;
	break ;

	case "*":
	 s = num1 * num2;
	break ;
	}
	JOptionPane.showMessageDialog(null,"the answer is"+s,"the title",JOptionPane.PLAIN_MESSAGE);
	}
}