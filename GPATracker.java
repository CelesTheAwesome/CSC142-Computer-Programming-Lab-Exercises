import java.util.Scanner;
import java.util.ArrayList;
public class GPATracker{
	public static void main(String[] args) {
	int input=0;
	int switcher=0;
	String name=("");
	Double grade=0.0;
	int credit=0;
	
	ArrayList<String> courseNames = new ArrayList<>();
	ArrayList<Double> grades = new ArrayList<>();
	ArrayList<Integer> classCredits = new ArrayList<>();
	
	while(switcher <1) {
	input=student.input();
	
	if (input==1){
	name=course.name();
	courseNames.add(name);
	
	grade=course.grade();
	grades.add(grade);
	
	credit=course.credit();
	classCredits.add(credit);
	}
	
	if(input==2){
	name=course.name();
	try {
	int index = courseNames.indexOf(name);
	courseNames.remove(index);
	grades.remove(index);
	classCredits.remove(index);}
	catch (java.lang.IndexOutOfBoundsException mitt){
		System.out.println("This is not a valid input");
	}
	finally {}
	}
	
	if(input==3){
	
	if(grades.size()>0 && classCredits.size()>0) {
		
	double GPA=GPACalculator.GPA(grades);
	int creditTotal=GPACalculator.creditTotal(classCredits);
	System.out.println("Your GPA is: "+GPA);
	System.out.println("Your total credits are: "+creditTotal);}
	
	
	else {System.out.println("This is not a valid input");}
	}
	
	if(input==4){
	switcher=1;
	System.out.println("Goodbye, have a nice day.");}
	if(input >4) {
	System.out.println("This is not a valid input");}
	System.out.println("");}}

	
	

	
	static class student{

		public static int input() {
		System.out.println("1. Add course.");
		System.out.println("2. Remove course.");
		System.out.println("3. View GPA.");
		System.out.println("4. Exit program.");
		System.out.println("Enter command(1-4): ");
		Scanner scanner = new Scanner(System.in);
		int input= scanner.nextInt();
		return input;}
		}
		
	static class course{
		public static String name() {
		System.out.println("Enter course name: ");
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.lineSeparator());
		String courseName= scanner.next();
		return courseName;}
		
		public static double grade() {
		System.out.println("Enter course grade percentage to 2 decimals: ");
		Scanner scanner = new Scanner(System.in);
		Double courseGrade= scanner.nextDouble();
		return courseGrade;}
		
		public static int credit() {
		System.out.println("Enter course credits: ");
		Scanner scanner = new Scanner(System.in);
		int courseCredits= scanner.nextInt();
		return courseCredits;}
		}
	
	static class GPACalculator{
		public static double GPA(ArrayList<Double> grades) {
		double gradeTotal=0.0;
		int i = 0;
		while (i < grades.size()) {
		gradeTotal=gradeTotal+grades.get(i);
		i++;}
		
		
		double GPA=gradeTotal/i;
		return GPA;}
		
		public static int creditTotal(ArrayList<Integer> classCredits) {
		int i=0;
		int creditTotal=0;
		while (i < classCredits.size()) {
		creditTotal= creditTotal + classCredits.get(i);
		i++;}
		return creditTotal;
		}
		}}