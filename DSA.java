import java.util.*;
public class DSA{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("1:Arraycalculator\n2:Linkedlistcalculator\n3:queuecalculator");
		int ch=in.nextInt();
		switch(ch)
		{
			case 1:
			ArCalculator.main(null);
			break;
			case 2:
			CalculatorLinkedList.main(null);
			break;
			case 3:
			CalculatorQueue.main(null);
			break;
			default:
			System.out.println("invalid");
		}
	}
}
			
			