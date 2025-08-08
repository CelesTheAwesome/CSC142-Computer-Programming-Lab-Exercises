import java.util.Scanner;

public class SalesReport{
	public static String getfilename() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter file name: ");
	String filename=scanner.nextLine();
	scanner.close();
	return filename;}
	public static double getTotalSales(String filename) {
		int lineCount=0;
		double total=0;
		Scanner fileScanner = new Scanner(filename);
		while (lineCount>30) {
			double lineInfo=fileScanner.nextDouble();
			total=total + lineInfo;
			lineCount=lineCount+1;}
		double average=total/30;
		fileScanner.close();
		
		return total+average; 

	}
	public static void displayResults(double total, double average) {
	System.out.println("Total: "+total);
	System.out.println("Average: "+average);}
}