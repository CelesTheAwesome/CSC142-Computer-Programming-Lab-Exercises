import java.util.Scanner;
import javax.swing.JOptionPane;

public class SalesReport{
	public static String getfilename() {
	String filename=JOptionPane.showInputDialog(null,"Enter file name: ");
	return filename;}
	public static double getTotalSales(String filename) {
		int lineCount=0;
		double total=0;
		Scanner fileScanner = new Scanner(filename);
		while (lineCount<30) {
			double lineInfo=fileScanner.nextDouble();
			total=total + lineInfo;
			lineCount=lineCount+1;}
		double average=total/30;
		fileScanner.close();
		
		return total+average; 

	}
	public static void displayResults(double total, double average) {
		JOptionPane.showMessageDialog(null, "The total is "+total+" and the average is "+average+".");}
}