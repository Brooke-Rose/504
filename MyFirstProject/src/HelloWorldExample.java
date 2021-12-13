import java.util.Scanner;

   

   public class CalculateTax {

	   public static void main(String[] args) {

	   		final double tax = 0.15;

	   		

	   		Scanner scanner = new Scanner(System.in);

	   		double salary = 0;

	  		System.out.println("Enter your salary: ");

	  		salary = scanner.nextDouble();

	  		

	  		

	  		double taxToPay;

	  		taxToPay = salary * tax;

	  		

	  		// Output how much tax they have to pay

	  		System.out.println("Salary\tTax");

	  		System.out.println("$" + salary + "\t$" + taxToPay);

	  	}

	  


  

  }