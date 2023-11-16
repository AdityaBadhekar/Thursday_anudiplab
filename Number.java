/*3)Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Checkk the given character is vowel or not
	4.check the given no is divible by 5 or not*/
package practical;
import java.util.Scanner;
public class Number {
	        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);        //to get the input from the user 
	        System.out.println("Enter your choice: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                 System.out.println("Enter three numbers: ");
	                 int num1=sc.nextInt();
	                 int num2 = sc.nextInt();
	                 int num3=sc.nextInt();
	                 if (num1 >= num2 && num1 >= num3)        //conditions to check the numbers
	                   System.out.println(num1 + " is the largest number.");
	                 else if (num2 >= num1 && num2 >= num3)
	                   System.out.println(num2 + " is the largest number.");
	                 else
	                    System.out.println(num3 + " is the largest number.");
	                 break;
	            case 2:
	                 System.out.println("Enter a number: ");
	                 int number = sc.nextInt();
	                 if (number % 2 == 0)					//condition to check number is even or odd
	                 {
	                    System.out.println("The number is even.");
	                } else {
	                    System.out.println("The number is odd.");
	                }
	                 break;
	            case 3:
	                 System.out.println("Enter a character: ");     //conditions to check the character is vowel or not
	                 char ch = sc.next().charAt(0);
	                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	             {
	                    System.out.println("The character is a vowel.");
	                }else {
	                    System.out.println("The character is not a vowel.");
	                }
	                 break;
	            case 4:
	                 System.out.println("Enter a number: ");
	                 int num = sc.nextInt();
	                 if (num % 5 == 0)                             //condition to check the number is divisible by 5 or not
	                 {
	                    System.out.println("The number is divisible by 5.");
	                }else {
	                    System.out.println("The number is not divisible by 5.");
	                }
	                 break;
	            default:
	                 System.out.println("Invalid choice!");
	                 break;
	        }
	    }
}