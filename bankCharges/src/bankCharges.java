import java.util.Scanner;

public class bankCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of checks: ");
        double checkFee = 0;
        int checks = scanner.nextInt();
        if (checks < 20 ) {
        checkFee = checks*0.1;}
        else if (checks >=20) {
        	if (checks <=39) {
        		checkFee=checks*0.08;}
        else if (checks > 39) {
        	if (checks <= 59) {
        		checkFee=checks*0.06;}}}
        		if (checks >= 60) {
        			checkFee=checks*0.04;}
        	double totalCharge= checkFee + 10;	
        
        System.out.println("Base fee: $10.00");
        System.out.println("Check fee: $" + checkFee);
        System.out.println("Total service charge: $"+totalCharge);
    
        scanner.close();
    }
    	
    

	

    	
        }
        
    
