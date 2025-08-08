import java.util.Scanner;

public class creditCard{
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter annual salary: ");
    int salary = scanner.nextInt();
    System.out.print("Enter credit rating (1-10): ");
    int credit = scanner.nextInt();
    scanner.close();
    if (salary >=20000 && credit >=7) {creditCard.qualify();}

    else {creditCard.noQualify();}

	
    
    
    
    
}	public static void qualify() {System.out.println("You qualify for the credit card.");}
public static void noQualify() {    		System.out.println("You do not qualify for the credit card.");
}}


