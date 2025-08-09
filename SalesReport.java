import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class SalesReport{
	public static String getfilename() {
	String filename=JOptionPane.showInputDialog(null,"Enter file name: ");
	return filename;}
	public static double getTotalSales(String filename) {
		int lineCount=0;
		double total=0;
		double average=0;
		try {
		Scanner fileScanner = new Scanner(filename);
		while (lineCount<30 && fileScanner.hasNextDouble()) {
			double lineInfo=fileScanner.nextDouble();
			total=total + lineInfo;
			lineCount=lineCount+1;}
		average=total/lineCount;
		fileScanner.close();
		} finally {}

		return total+average; }
	public static void displayResults(double total, double average) {
		JOptionPane.showMessageDialog(null, "The total is "+total+" and the average is "+average+".");}
}
