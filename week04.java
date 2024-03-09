package week04;

public class week04 {



public static void main(String[] args) {


//Result A is the result of programmatically subtracting
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
int resultA = ages[ages.length - 1] - ages[0];
System.out.println("This is question 1.\t" + "Result A: " + resultA);

//Result B is the result of programmatically subtracting 
int[] ages2 = new int[9];
int resultB = ages2[ages2.length - 1] - ages2[4];
System.out.println("This is question 1.5.\t" + "Result B: " + resultB);

//An array with 6 requested names
int sum = 0;
for (int age : ages) {
sum += age;
}
double average = (double) sum / ages.length-1;
System.out.println("This is question 2.\t" + "Average Age: " + average);



//String Array Operation A:
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
double averageLetters = 0;
for (String name : names) {
averageLetters += name.length();
}
averageLetters /= names.length;
System.out.println("This is question 2.\t" + "Average Letters per Name: " + averageLetters);



//String Array Operation B:
String concatenatedNames = "";
for (String name : names) {
concatenatedNames += name + " ";
}
System.out.println("This is question 3.\t" + "Concatenated Names: " + concatenatedNames.trim());



//Use array.length - 1
int lastElement = ages[ages.length - 1];
System.out.println("This is question 4.\t" + lastElement);



//Use array[0] to: iterate over the previous array
int firstElement = ages[0];
System.out.println("This is question 5.\t" + firstElement);


//Add the length of each name to the nameLengths array
int[] nameLengths = new int[names.length];
for (int i = 0; i < names.length; i++) {
nameLengths[i] = names[i].length();
}
int sumNameLengths = 0;
for (int length : nameLengths) {
sumNameLengths += length;
}

System.out.println("This is question 6.\t" + "Sum of Name Lengths: " + sumNameLengths);

System.out.println("This is question 7.\t" + concatenateWord("hello", 3));

String firstName = "Larry";
String lastName = "David";

System.out.println("This is question 8.\t" + getFullName(firstName, lastName));

System.out.println("This is question 9.\t" + isSumGreaterThan100(nameLengths));

double[] array1 = {2.5, 3.0, 4.5, 5.0};

System.out.println("This is question 10.\t" + calculateAverage(array1));

double[] array2 = {1.5, 2.0, 3.5, 4.0};

System.out.println("This is question 11.\t" + compareAverages(array1, array2));

System.out.println("This is question 12.\t" + willBuyDrink(true, 10.6));

String say = "hello";

System.out.println("This is question 13.\t" + countVowels(say));

} // end of main


//Calculate the sum of all elements in the array
public static String concatenateWord(String word, int n) {
StringBuilder result = new StringBuilder();
for (int i = 0; i < n; i++) {
result.append(word);
}
return result.toString();
}


//Get full name
public static String getFullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}


// Use a boolean to find if the sum is greater than 100
public static boolean isSumGreaterThan100(int[] numbers) {
int sum = 0;
for (int num : numbers) {
sum += num;
}
return sum > 100;
}


//Calculate averages of elements in array
public static double calculateAverage(double[] numbers) {
double sum = 0;
for (double num : numbers) {
sum += num;
}
return sum / numbers.length;
}


//Compare averages between two arrays
public static boolean compareAverages(double[] arr1, double[] arr2) {
	return calculateAverage(arr1) > calculateAverage(arr2);
}



//Use a boolean to determine if drink will be bought
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside = true && moneyInPocket > 10.50;
}


// Count vowels in hello
public static int countVowels(String inputString) {
int count = 0;
for (char ch : inputString.toLowerCase().toCharArray()) {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
count++;
}
}
return count;

}
} 

