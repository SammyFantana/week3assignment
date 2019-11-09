
public class MadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (do not type ANY numbers in the operation, ages[7] – ages[0] is not allowed). Print the result to the console.
b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
*/ 
//	int[] ages = new int[9];
//		ages[0] = 3;
//		ages[1] = 9;
//		ages[2] = 23;
//		ages[3] = 64;
//		ages[4] = 2;
//		ages[5] = 8;
//		ages[6] = 28;
//		ages[7] = 93;
//		ages[8] = 30;
//		
//		System.out.println(ages[(ages.length -1)] - ages[0]);
//		
//		int sum = 0;
//		
//		for (int i = 0; i < ages.length; i++) {
//
//			sum = sum + ages[i];
//			
//		}
//		System.out.println(sum / ages.length);
		
/*2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
*/
//		String[] names = new String[6];
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob" ;
//		int sum = 0;
//		for (String name : names) {
//			sum = sum + name.length();
//
//		}
//		System.out.println(sum / names.length);
//		String listOfNames = " ";
//		for (String name : names) {
//			listOfNames = listOfNames + " " + name;
//		}
//		System.out.println(listOfNames);
/*3.	How do you access the last element of any array?*/
//		array[(array.length - 1)]
/*4.	How do you access the first element of any array?*/
//		array[0]
/*5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.*/
//		
//		int[] nameLengths = new int[6];
//		int arrayIndex = 0;
//	for (String name : names) {
//		nameLengths[arrayIndex++] = name.length();
//		
//	}
//		System.out.println(nameLengths[4]);
/*
 * 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
 */
//		int sumOfNameLengths = 0;
//		for (int name : nameLengths) {
//			sumOfNameLengths += name;
//		}
//		System.out.println(sumOfNameLengths);
		
/*
 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
 */
//		7/System.out.println(repeater("hello", 5));
//		8/System.out.println(fullName("sam", "Nichols"));
	}
	
	public static String repeater(String word, int n) {
		String fused = "";
		for (int i = 0; i < n; i++) {
			fused += word;
		}
		return fused;
	}
	
	/*
	 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	 */
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	/*
	 * 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 */
	
	public static boolean grandSum(int[] k) {
		int sum = 0;
		for (int l : k) {
			sum += l;
		if (sum > 100)
			return true;
		}  
		
	}
	/*
	 * 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 */
	public static double avg(double[] cash) {
		double sum = 0;
		for (double dollar : cash) {
			sum += dollar;
			
		}
		return sum / cash.length;
	}
	/*
	 * 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 */
	public static boolean bigger(double[] big1, double[] big2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double big : big1) {
			sum1 += big;
		}
		for (double big : big2) {
			sum2 += big;
		}
		if ((sum1 / big1.length) > (sum2 / big2.length)) {
			return true;
		}
	}
	/*
	 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 */
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if (isHotOutSide && moneyInPocket > 10.50) {
			return true;
		}
	}
	/*
	 * 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.: Method determines weather prudent reserve in savings is sufficient. I need a green light to be able to spend money however I always make sure that I have enough money for 3 months worth of bills but some people may have a different amount of time they would like to have saved up.
	 */
	public static String prudentReserve(double[] bills, int months, double savings) {
		int sum = 0;
		for (double bill : bills) {
			sum += bill;
		}
		if (savings > (sum * months)) {
			return "Go for it";
		} else {
			return "Keep Saving";
		}
	}
	
	
}
