/*2)Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%
below 60
M,F: 5%*/
package practical;
import java.util.Scanner;
public class Rate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       //to take input from the user
        System.out.println("Enter your age: ");
        int age =sc.nextInt();
        System.out.println("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);
        double rateofinterest = 0;
        if (age >= 60) {                 //condition to check users age is greater than 60 or not
             if (gender == 'M')
            {
                rateofinterest = 7.0;
            } else if (gender == 'F')
            {
                rateofinterest = 7.5;
            } else {
            }
        }    else
           {
        	 if((age <= 60))          ////condition to check users age is less than 60 or not
                if (gender == 'M' || gender == 'F') 
               {
                 rateofinterest = 5.0;
            } else
            {
            }
        }
        System.out.println("Rate of interest: " + rateofinterest + "%");
    }
}