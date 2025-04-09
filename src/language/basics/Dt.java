package language.basics;

public class Dt {

	public static void main(String[] args) {
		// Temperature of a city in degrees Celsius:25.5(Datatype is float or string can be used)
		float temp = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius is " + temp);

		// 2. Whether a customer has placed an order: true or false

		// 3. Person's phone number: "123-456-7890"(Datatype is string)
		String phonenumber = "123-456-7890";
		System.out.println("person's phone number:" + phonenumber);

		// 4. Amount of money in a customer's bank account: 1000.50
		String amountinaccount = "1000.50";
		System.out.println("Amount of money in a customer's bank account:" + amountinaccount);

		// 5. Person's email address: "john.doe@example.com"
		String mailid = "john.doe@example.com";
		System.out.println("Person's email address:" + mailid);

		// 6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194 (data type is array)
		String[] coordinates = { "37.7749", "-122.4194" };
		System.out.print("Latitude: " + coordinates[0]);
		System.out.println(" & Longitude:" + coordinates[1]);

		/*
		 * 7. Person's marital status: true or false
		 * 
		 * boolean Maritalstatus=True;
		 * System.out.println("Person's marital status:"+Maritalstatus);
		 */

		// 8. Person's occupation: "Software Engineer"
		String Occupation = "Software Engineer";
		System.out.println("Person's occupation:" + Occupation);

		// 9. Person's favourite colour: "Blue"
		String favcolour = "Blue";
		System.out.println("Person's favourite colour:" + favcolour);

		// 10.Current year: 2023
		short year = 2023;
		System.out.println("Current year:" + year);

		// 11.Number of followers on a social media platform: 1,000,000
		String followers = "1,000,000";
		System.out.println("Number of followers on a social media platform:" + followers);

		// 12.Rating of a movie: 7.5 (Data type can be string or float)
		float rating = 7.5f;
		System.out.println("Rating of a movie is " + rating);

		// 13.Person's blood type: 'A'
		char bloodgroup = 'A';
		System.out.println("Person's blood type:" + bloodgroup);

		// 14.Title of a book: "To Kill a Mockingbird"(By using data types unable to add "", working with normal print statement )
		String book = "To Kill a Mockingbird";
		System.out.println("Title of a book:" + book);
		System.out.println("Title of a book:\"To Kill a Mockingbird\" ");

		// 15.Number of employees in a company: 500
		short noofemployees = 500;
		System.out.println("Number of employees in a company:" + noofemployees);
		// 16.Time of an event: 2:30 PM
		String time = "2:30 PM";
		System.out.println("Time of an event: " + time);
		// 17.Name of a country: "United States"
		String country = "United States";
		System.out.println("Name of a country:" + country);

		// 18.Person's eye color: "Brown"
		String eyecolour = "Brown";
		System.out.println("Person's eye color:" + eyecolour);
		System.out.println("Person's eye color: \"Brown\"");
		// 19.Person's birthplace: "New York City"
		String birthplace = "New Yeark City";
		System.out.println("Person's birthplace:" + birthplace);
		// 20.Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.println("Distance between two cities: " + distance);

	}

}
