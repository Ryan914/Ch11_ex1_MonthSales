import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		double[] monthSales = { 7.45, 8.57, 1.59, 7.66, 1.73, 9.41, 5.79, 2.45, 9.62, 1.79, 6.09, 2.88 };

		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthName.length) {
				Console.displayLine("Invalid month number. Try again.");
				continue;
			}

			// get the index number for the month
			// and display the month name and sales

			System.out.println("Sales for " + monthName[monthNumber - 1] + ": " + monthSales[monthNumber - 1]);

			// check if the user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			Console.displayLine();

		}

		double total = 0;

		for (int i = 0; i < monthSales.length; i++)
			total = total + monthSales[i];
		System.out.println(total);

		// display the total sales for the year
		System.out.println(total);
		Console.displayLine();
	}

}
